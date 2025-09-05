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
    public boolean isEvenOddTree(TreeNode root) {
        boolean flag = true; // even
        Queue<TreeNode> q  = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            int val=Integer.MIN_VALUE;
            int val1 = Integer.MAX_VALUE;
            for(int i =0; i<size; i++){
                TreeNode current = q.poll();
                if(flag){
                    if(current.val %2==0) return false;
                    if(current.val <= val) return false;
                    val = current.val;
                }
                else{
                    if(current.val %2==1) return false;
                    if(current.val >= val1 ) return false;
                    val1 = current.val;
        
                }
                if(current.left != null ) q.offer(current.left);
                if(current.right != null ) q.offer(current.right);

            }
            if(flag) flag = false;
            else flag = true;
        }
        return true;
    }
}