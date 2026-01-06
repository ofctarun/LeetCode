/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        int ansLevel = 1, ansValue = root.val;
        int level = 1;
        q.offer(root);
        while(!q.isEmpty()){
            int len = q.size();
            int curr = 0;
            while(len-- > 0){
                TreeNode node = q.poll();
                curr += node.val;
                if(node.left != null)q.offer(node.left);
                if(node.right != null)q.offer(node.right);
            }
            if(ansValue < curr){
                ansValue = curr;
                ansLevel = level;
            }
            level++;
        }
        return ansLevel;
    }
}