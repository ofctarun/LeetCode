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
    public boolean isValidBST(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        inorderTraversal(root, values);
        List<Integer> sortedValues = new ArrayList<>(values);
        Collections.sort(sortedValues);
        for (int i = 1; i < sortedValues.size(); i++) {
            if (sortedValues.get(i).equals(sortedValues.get(i - 1))) {
                return false;
            }
        }
        return values.equals(sortedValues);
    }
    private void inorderTraversal(TreeNode root, List<Integer> values) {
        if (root == null) return;
        inorderTraversal(root.left, values);
        values.add(root.val);
        inorderTraversal(root.right, values);
    }
}