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
    public boolean isBalanced(TreeNode root) {
        return isBalancedNode(root)[1] <= 1;
    }

    public int[] isBalancedNode(TreeNode root) {
        if(root == null){
            return new int[]{-1,0};
        }
        int[] left = isBalancedNode(root.left);
        int[] right = isBalancedNode(root.right);

        if(left[1] > 1 || right[1] > 1){
            return new int[]{0,Math.max(left[1], right[1])};
        }
        int height = 1 + Math.max(left[0], right[0]);
        int diff = Math.abs(left[0]-right[0]);

        return new int[]{height,diff};

    }
}
