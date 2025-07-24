package COM.Vedant_LeetCode;

//Solution link : https://leetcode.com/problems/find-subarrays-with-equal-sum/solutions/6154015/easy-java-solution-brute-force-approach-19j05

//Problem link : https://leetcode.com/problems/find-subarrays-with-equal-sum/

public class Problem2395FindSubArrays {
    public static void main(String[] args) {
        int [] arr = {1,2,2,1,5};
        System.out.println(findSubarrays(arr));
    }
    public static boolean findSubarrays(int[] nums) {
        int count = 0;
        for (int start=0; start<nums.length-1; start++){
            for(int end = start+1; end<nums.length-1; end++){
                if(nums[end]+nums[end+1]== nums[start]+nums[start+1]){
                    count++;
                }
            }

        }
        return count>=1;
    }
}
