/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;

        ArrayList<TreeNode> arr1 = new ArrayList<>();
        ArrayList<TreeNode> arr2 = new ArrayList<>();
        getPath(root,p,arr1);
        getPath(root,q,arr2);
        int i =0;
        for(;i<arr1.size() && i<arr2.size(); i++){
            if(arr1.get(i) !=arr2.get(i)){
                break;
            }
        }
        TreeNode lca = arr1.get(i-1);
        return lca; 

    } 

    public static boolean getPath(TreeNode root , TreeNode toFind, ArrayList<TreeNode> path){
        if(root == null){
            return false;
        }
        path.add(root);
        if(root.val == toFind.val){
            return true;
        }
        boolean findLeft = getPath(root.left , toFind,path);
        boolean findRight = getPath(root.right , toFind,path);
        if(findLeft || findRight){
            return true;
        }
        path.remove(path.size()-1);
        return false;        
    }
}