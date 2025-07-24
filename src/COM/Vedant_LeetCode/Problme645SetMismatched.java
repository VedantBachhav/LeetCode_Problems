package COM.Vedant_LeetCode;

//problem Link : https://leetcode.com/problems/set-mismatch/description/

//Solution Link : https://leetcode.com/problems/set-mismatch/solutions/6121101/java-solution-beats-83-19-by-using-cycle-sort/

import java.util.Arrays;

public class Problme645SetMismatched {
    public static void main(String[] args) {
        int [] nums = {1,2,2,4};
//        output : 2,3
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
    public static int[] findErrorNums(int[] nums) {
        for (int i = 0; i < nums.length;) {

            int index = nums[i] - 1;
            if (nums[index] != nums[i]) {
                int swap = nums[i];
                nums[i] = nums[index];
                nums[index] = swap;
            } else {
                i++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return new int[] { nums[i], i + 1 };
            }
        }
        return new int[] { -1, -1 };

    }
}