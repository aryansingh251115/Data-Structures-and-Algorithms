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
    int dm = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        helper(root);
        return dm;
    }
    public int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int lh = helper(root.left);
        int rh = helper(root.right);
        dm = Math.max(dm , lh+rh);
        return ( Math.max(lh , rh) + 1) ;
    }
}