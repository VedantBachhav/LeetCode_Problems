class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        helper(candidates, target, result, ans, 0,0);
        return result;
    }
    public static void helper(int [] candidates, int target, List<List<Integer>> result, List<Integer> ans, int index, int sum){

        if (sum > target) return;        
        if (index >= candidates.length) return; // stop if out of bounds

        if (sum == target) {             // valid combination found
            result.add(new ArrayList<>(ans));
            return;
        }

        sum+=candidates[index];
        ans.add(candidates[index]);
        helper(candidates, target,result, ans,index, sum);
        sum-=candidates[index];
        ans.remove(ans.size()-1);
        helper(candidates, target, result, ans, index+1, sum);
    }
}