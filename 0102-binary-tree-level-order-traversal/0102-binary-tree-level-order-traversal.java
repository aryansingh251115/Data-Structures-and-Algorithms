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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            List<List<Integer>> a = new ArrayList<>();
            return a;
        }

        List<List<Integer>> arr = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int idx = 0;
        arr.add(new ArrayList<>());
        while (!q.isEmpty()) {
            TreeNode curr = q.remove();

            if (curr == null) {
                idx++;
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                    arr.add(new ArrayList<>());

                }
            } else {
                arr.get(idx).add(curr.val);
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
        return arr;

    }
}