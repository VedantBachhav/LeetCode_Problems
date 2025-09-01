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
    
    public int findTilt(TreeNode root) {
        tilt(root);
        return sumOfNode(root);
    }
    int tilt(TreeNode root){
        if(root==null) return 0;
        int left=0;
        if(root.left!=null)
           left=left+root.left.val+tilt(root.left);

         int right=0;
        if(root.right!=null)
           right=right+root.right.val+tilt(root.right);
        int cur=root.val;
        root.val=Math.abs(left-right);
        return left+right;
    }
    int sumOfNode(TreeNode root){
        if(root==null) return 0;
        return root.val+sumOfNode(root.left)+sumOfNode(root.right);
    }
}