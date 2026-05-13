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
        HashMap<TreeNode, Integer> depths = new HashMap<TreeNode, Integer>();
        int max = maxDepth(root, depths, 0);
        int dia = 0;
        for (Integer depth : depths.values()){
            dia = Math.max(depth, dia);
        }
        return dia;
    }

    public int maxDepth(TreeNode root, HashMap<TreeNode, Integer> depths, int max){
        if(root == null){
            return -1;
        } else {
            int leftMax = 1 + maxDepth(root.left, depths, max);
            int rightMax = 1 + maxDepth(root.right, depths, max);
            int a = root.left != null ? root.left.val : -1;
            int b = root.right != null ? root.right.val : -1;
            System.out.println("At Root " + root.val + ", " + a + ": " + leftMax 
            + " " + b + ": " + rightMax);
            int dia = leftMax + rightMax;
            depths.put(root,Math.max(max, dia));
            max = Math.max(leftMax,rightMax);
            System.out.println("Depth : " + max + ", Diameter " + dia);
            return max;
        }
    }
}
