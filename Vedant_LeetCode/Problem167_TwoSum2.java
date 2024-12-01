package COM.Vedant_LeetCode;

import java.util.Arrays;


//Problem link : https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

// Solution Approach link : https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/solutions/6101888/using-binary-search-2-pointer-approach-with-detailed-explanation/

//level = Leetcode Medium;

// complexity :  Time compexity = O(N)
//               Space complexity = O(1)

public class Problem167_TwoSum2 {
    public static void main(String[] args) {
        int[] arr = {5,7,1};
        int target = 8;
        System.out.println(Arrays.toString(twoSum(arr,target)));  // output will be 2,3
    }


    public static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;

        // used binary search;
        while(start<=end){
            int sum= numbers[start]+numbers[end];

            // if sum == target then return actual position.
            if(sum==target){
                return new int [] {start+1, end+1};
            }

            // if sum is greater than target then end will be decreased by 1
            else if(sum>target){
                end--;
            }

            // if sum is smaller than target then end will be decreased by 1

            else{
                start++;
            }
        }
        return new int[] {-1,-1};
    }
}