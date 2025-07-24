package COM.Vedant_LeetCode;

//Problem Link : https://leetcode.com/problems/monotonic-array/
public class Problem896MonotonicArray {
    public static void main(String[] args) {
        int [] arr = {1,2,5,3,4};
        System.out.println(isMonotonic(arr));

    }
    public static boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 0; i<nums.length-1; i++){
            // its check if nums[i] > nums[i+1] then array is in decreaseing order then it turn increasing fasle;
            if(nums[i]>nums[i+1]){
                increasing = false;
            }

            // its check if nums[i] < nums[i+1] then array is in increaseing order then it turn decreasing fasle;

            if(nums[i]<nums[i+1]){
                decreasing = false;
            }
        }
        // return answer using or operator if anyone is true then print true (array is monotonic) both are false then array is not monotonic
        return increasing || decreasing;
    }
}
