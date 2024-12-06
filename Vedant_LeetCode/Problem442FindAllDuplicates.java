package COM.Vedant_LeetCode;

// Solved problem using cycle sort.

//Problem link : https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

//Solution link : https://leetcode.com/problems/find-all-duplicates-in-an-array/solutions/6121020/easy-java-solution-beats-75-16-by-sorting/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem442FindAllDuplicates {
    public static void main(String[] args) {
        int [] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findAllDuplicates(arr));
//        System.out.println(Arrays.toString(findAllDuplicates(arr)));
    }
    public static List<Integer> findAllDuplicates(int [] nums){
        List<Integer> ans = new ArrayList<>();

        for(int index =0; index<nums.length;){
            int correct = nums[index]-1;
            if(nums[index] > 0 && nums[index] <= nums.length && nums[correct] != nums[index]) {
                int swap = nums[index];
                nums[index] = nums[correct];
                nums[correct] = swap;
            }
            else{
                index++;
            }
        }

        for(int index = 0; index<nums.length; index++){
            if(nums[index] != index+1){
                ans.add(nums[index]);
            }
        }

        return ans;
    }
}