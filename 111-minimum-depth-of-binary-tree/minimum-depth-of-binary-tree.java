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
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        int leftSide = minDepth(root.left);
        int rightSide = minDepth(root.right);
        if(leftSide == 0 || rightSide == 0) {
            return Math.max(leftSide,rightSide)+1;
        }
        return Math.min(leftSide, rightSide)+1;
       }
}