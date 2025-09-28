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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return helper(root, 0 , targetSum);
    }
    public boolean helper(TreeNode root , int sum,int target){
        if(root == null){
            return false;
        }
        sum += root.val;
        if(root.left == null && root.right == null){
            return sum == target;
        }
        boolean ltree = helper(root.left , sum , target);
        boolean rtree = helper(root.right , sum , target);
        return ltree || rtree;
    }
}