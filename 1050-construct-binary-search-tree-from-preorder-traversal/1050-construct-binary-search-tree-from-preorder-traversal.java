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
    int idx = 0;
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder.length == 0){
            return null;
        }else if(preorder.length ==1 ){
            TreeNode TN = new TreeNode(preorder[0]);
            return TN;
        }
        
        return helper(preorder, Integer.MAX_VALUE);
            
    }

    public TreeNode helper(int preorder[] ,int bound ){
       if(idx == preorder.length || preorder[idx] > bound){
        return null;
       }

        TreeNode newroot = new TreeNode(preorder[idx++]);
        newroot.left = (helper(preorder ,newroot.val));
        newroot.right = (helper(preorder , bound));
        return newroot;

    }
}