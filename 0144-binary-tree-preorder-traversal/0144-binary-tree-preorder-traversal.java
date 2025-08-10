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
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            List<Integer> a = new ArrayList<>();
            return a;
        }
        List<Integer> arr = new ArrayList<>();
        helper(root , arr);
        return arr;

    }

    public TreeNode helper(TreeNode root , List<Integer> arr){
        if(root == null){
            return null;
        }
        arr.add(root.val);
        helper(root.left , arr);
        helper(root.right , arr);
        return root;
    }
}