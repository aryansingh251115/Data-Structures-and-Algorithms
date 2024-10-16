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
    public static int finalSum(TreeNode curr , TreeNode parent){
        if(curr == null){
            return 0 ;
        }
        int left = finalSum(curr.left , curr);
        int right = finalSum(curr.right , curr);
        int sum = 0;
        if(curr.left == null && curr.right == null){
            if(parent != null && parent.left == curr){
                sum += curr.val;
            }
        }
    return left+right+sum;
    }
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null){
            return 0;
        }
        TreeNode parent = null;
        return finalSum(root,parent);
    }
}