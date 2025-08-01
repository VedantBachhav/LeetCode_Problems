class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        subset(nums, result, new ArrayList<>(), 0);
        return result;
    }

    public void subset(int[] nums, List<List<Integer>> result, List<Integer> current, int i) {
        if(i==nums.length){
            result.add(new ArrayList<>(current));
            return;
        }

        current.add(nums[i]);
        subset(nums, result, current, i+1);
        current.remove(current.size() - 1);
        subset(nums,result, current, i+1);
    }
}   