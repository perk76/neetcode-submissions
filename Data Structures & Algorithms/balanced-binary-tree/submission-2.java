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
        return Math.abs(heightDiff(root)[1]) == 1; 
    }

    public int[] heightDiff(TreeNode root) {
        if(root == null){
            return new int[]{-1, 1};
        }
        else {
            int[] leftHeight = heightDiff(root.left);
            int[] rightHeight = heightDiff(root.right);
            int height = 1 + Math.max(leftHeight[0],rightHeight[0]);
            int diff = Math.abs(leftHeight[0] - rightHeight[0]);
            System.out.println("For Root :" + root.val + " Height :" + height + " Diff :" + diff);
            if(leftHeight[1] == 0 || rightHeight[1] == 0 || diff > 1 ){
                return new int[]{height, 0};
            }
            return new int[]{height,1};
        }
    }
}
