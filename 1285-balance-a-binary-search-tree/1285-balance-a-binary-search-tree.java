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
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr = inorder(root,arr);
        return helper(arr,0 ,arr.size()-1);
    }

    public TreeNode helper(ArrayList<Integer> arr,int start , int end){
        if(start > end) return null;
        int mid  = start + (end - start)/2;
        TreeNode root = new TreeNode(arr.get(mid));
        root.left = helper(arr,start , mid-1);
        root.right = helper(arr,mid+1 , end);
        return root;
    }



    public ArrayList<Integer> inorder(TreeNode root,ArrayList<Integer> arr){
        if(root == null){
            return arr;
        }

        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);

        return arr;
    }
}









