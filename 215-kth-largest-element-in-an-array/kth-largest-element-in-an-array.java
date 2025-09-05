class Solution {
    public int findKthLargest(int[] nums, int k) {

        if(k<1 || k>nums.length) return 0;
        Arrays.sort(nums);
        int idx = nums.length - k;
        int ans = nums[idx];
        return ans;
    }
}