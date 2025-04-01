package COM.Vedant_LeetCode;
import java.util.Arrays;
//Problem Link : https://leetcode.com/problems/rotate-array/description/

// Solution Link : https://leetcode.com/problems/rotate-array/solutions/6605050/easy-java-solution-with-two-approaches-b-cpzr/

public class problem189RotateArray {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7};
        rotate(nums, 3);
        rotate1(nums,3);
    }

//    1. // brute force approach time and space complexity is O(N)

    public static void rotate(int[] nums, int k) {


         k = k % nums.length;
         int[] arr = new int[nums.length];
         for (int i = 0; i < nums.length; i++) {
             if (i < k) {
                 arr[i] = nums[nums.length - k + i];
             } else {
                 arr[i] = nums[i - k];
             }
         }
         System.arraycopy(arr, 0, nums, 0, nums.length);

         System.out.println(Arrays.toString(nums));
    }


//    2. // optimized approach time complxity is O(N) and space complexity is O(1)
        public static void rotate1(int[] nums, int k) {

            k = k % nums.length - 1;
            reverse(0, nums.length - 1, nums);
            reverse(0, k, nums);
            reverse(k + 1, nums.length - 1, nums);

            System.out.println(Arrays.toString(nums));

        }

        public static int[] reverse(int start, int end, int[] arr) {
            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;

            }
            return arr;
        }



}
