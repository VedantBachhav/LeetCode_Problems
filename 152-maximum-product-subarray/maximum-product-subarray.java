class Solution {
    public int maxProduct(int[] nums) {
    //     if(nums.length == 0) return 0;
    //    int sum = nums[0];
    //    for(int i =0; i<nums.length; i++){
    //     int mul = nums[i];
    //     sum = Math.max(sum, mul);
    //     for(int j = i+1;  j<nums.length; j++){
    //         mul = mul *nums[j];
    //         sum = Math.max(sum, mul);
    //     }
    //    }
    //    return sum;


    int max = nums[0], min = nums[0], ans = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            
            int temp = max;  // store the max because before updating min your max will already be updated
            
            max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]);
            min = Math.min(Math.min(temp * nums[i], min * nums[i]), nums[i]);
            
            if (max > ans) {
                ans = max;
            }
        }
        
        return ans;

    }
}