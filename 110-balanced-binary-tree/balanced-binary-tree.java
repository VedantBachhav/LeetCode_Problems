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
        return checkHeight(root) != -1;
    }
    public int checkHeight(TreeNode root){
        if(root == null) return 0;
        int leftSide = checkHeight(root.left);
        int rightSide = checkHeight(root.right);
        if(leftSide == -1 || rightSide == -1) return -1;
        if(Math.abs(leftSide-rightSide)>1) return -1;
        return Math.max(leftSide, rightSide) + 1;

    }
}