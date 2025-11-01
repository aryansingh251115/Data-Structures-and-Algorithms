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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        List<Integer> lst = new ArrayList<>();
        for (int i : nums) {
            lst.add(i);
        }
        return helper(new TreeNode(), lst);

    }

    public TreeNode helper(TreeNode root, List<Integer> lst) {
        if (lst.size() == 0) {
            root = null;
            return root;
        }
        root = max(lst);
        List<Integer> subLstLeft = lst.subList(0, lst.indexOf(root.val));
        List<Integer> subLstRight = lst.subList(lst.indexOf(root.val) + 1, lst.size());
        root.left = helper(root.left, subLstLeft);
        root.right = helper(root.right, subLstRight);

        return root;

    }

    public TreeNode max(List<Integer> nums) {
        if (nums.size() == 0) {
            return null;
        }
        int ans = Integer.MIN_VALUE;
        for (int i : nums) {
            if (i > ans) {
                ans = i;
            }
        }
        TreeNode ansNode = new TreeNode(ans);
        return ansNode;
    }
}