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
    int sum =0;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(root, targetSum, result, list,sum);
        return result;
    }
   public void helper(TreeNode root, int targetSum, List<List<Integer>> result, List<Integer> path, int sum) {
        if(root == null) 
        
        return ;
        
        sum = sum+root.val;
        path.add(root.val);

        if(root.left == null && root.right == null && sum == targetSum){
            result.add(new ArrayList<>(path));
        }
        if(root.left != null) helper(root.left, targetSum, result, path, sum);
        if(root.right != null) helper(root.right, targetSum, result, path, sum);
        path.remove(path.size()-1);
        sum = sum-root.val;
        
        
}
}