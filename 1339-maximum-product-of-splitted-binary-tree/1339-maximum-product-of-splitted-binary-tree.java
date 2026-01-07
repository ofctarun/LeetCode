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
    private long best = 0;
    private long totalSum = 0;
    long traverse(TreeNode root){
        if(root == null)return 0;
        return root.val + traverse(root.left) + traverse(root.right);
    }
    long dfs(TreeNode root){
        if (root == null) return 0;
        long sub = root.val + dfs(root.left) + dfs(root.right);
        best = Math.max(best,sub*(totalSum - sub));
        return sub;
    } 
    public int maxProduct(TreeNode root) {
        totalSum = traverse(root);
        dfs(root);
        return (int)(best % 1000000007); 
    }
}