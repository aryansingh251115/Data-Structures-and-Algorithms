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
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr = inorder(root, arr);

        int i = 0;
        int j = arr.size()-1;
        while(i<j){
            int sum = arr.get(i) + arr.get(j);
            if(sum == k) {
                return true;
            }else if(sum>k){
                j--;
            }else{
                i++;
            }
        }
    return false;
    }

    

    public ArrayList<Integer> inorder(TreeNode root, ArrayList<Integer> arr){
        if(root == null){
            return arr;
        }
        inorder(root.left , arr);
        arr.add(root.val);
        inorder(root.right , arr);
        return arr;
    }
}