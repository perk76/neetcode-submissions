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
    public int diameterOfBinaryTree(TreeNode root) {
        return diaDepth(root)[0];
    }

    public int[] diaDepth(TreeNode root){
        if(root == null){
            return new int[]{0,-1};
        }
        int[] left = diaDepth(root.left);
        int[] right = diaDepth(root.right);
        int depth = 1 + Math.max(left[1],right[1]);
        int dia = 2 + left[1] + right[1];
        dia = Math.max(dia, Math.max(left[0],right[0]));
        return new int []{dia,depth};
    }
}
