package COM.Vedant_LeetCode;

//Solution link : https://leetcode.com/problems/first-missing-positive/solutions/6123721/solution-in-java-beats-100-0-ms-o-n-easy-approach/

//Problem Link : https://leetcode.com/problems/first-missing-positive/description/

// Level : Hard

public class Problem41FirstMissingPos {
    public static void main(String[] args) {
        int [] arr = {1,2,3,-1,-2,5,7,8,9,10};
//        ans = 4
        System.out.println(firstMissingPositive(arr));
    }

    public static int firstMissingPositive(int[] nums) {

        for(int i = 0; i<nums.length;){
            int correctIndex = nums[i]-1;
            if(nums[i]>0 && nums.length >=nums[i] &&  nums[correctIndex]!=nums[i]){
                int swap = nums[i];
                nums[i]= nums[correctIndex];
                nums[correctIndex]= swap;
            }
            else{
                i++;
            }
        }

        for(int i = 0; i<nums.length;i++){
            if (nums[i] != i+1) {
                return i+1;
            }
        }
        return nums.length+1;
    }
}
