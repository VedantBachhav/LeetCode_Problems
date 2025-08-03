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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        // *********** time complexity : O(N)+O(N) used reverse method and space complexity : O(N)
        // this approach is readable and better but not in-place - beats 64% only; ************
        // List<List<Integer>> result = new ArrayList<>();
        // if(root == null ) return result;

        // Queue<TreeNode> q = new LinkedList<>();
        // q.offer(root);
        // while(!q.isEmpty()){
        //     int size = q.size();
        //     List<Integer> level = new ArrayList<>(size);
        //     for(int i = 0; i<size; i++){
        //         TreeNode curr = q.poll();
        //         level.add(curr.val);
        //         if(curr.left != null) q.offer(curr.left);
        //         if(curr.right != null ) q.offer(curr.right);
        //     }
        //     result.add(level);
        // }
        // int len = result.size();
        // for(int i = 0; i<len ; i++){
        //     if(i%2==1){
        //         Collections.reverse(result.get(i));
        //     }
        // }
        // return result;


        // *********** time complexity : O(N) not used reverse method and space complexity : O(N)
        // this approach is optimized and in-place - beats 94%+ only; ************
        

        List<List<Integer>> result = new ArrayList<>();
        if(root == null ) return result;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean flag = false;
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> level = new ArrayList<>(size);
            for(int i = 0; i<size; i++){
                TreeNode curr = q.poll();
                if(flag){
                     level.addFirst(curr.val);
                }else{
                    level.addLast(curr.val);
                }
                if(curr.left != null) q.offer(curr.left);
                if(curr.right != null ) q.offer(curr.right);
            }
            result.add(level);
            flag = !flag;
        }
        
        return result;
    }
}