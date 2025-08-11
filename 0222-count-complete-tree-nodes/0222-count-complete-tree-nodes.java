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
    public int countNodes(TreeNode root) {
        int count = 0;
        return helper(root);
    }

    public int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int lh = helper(root.left);
        int rh = helper(root.right);
        return lh+rh+1;
    }
}