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
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr = helper(arr ,root);
        return arr.get(k-1);
    }

    public ArrayList<Integer> helper(ArrayList<Integer> arr , TreeNode root){
        if(root == null) return arr;

        helper(arr , root.left);
        arr.add(root.val);
        helper(arr , root.right);
        return arr;
    }
}