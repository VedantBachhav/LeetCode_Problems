package COM.Vedant_LeetCode;

import java.util.Arrays;

//Problem link Leetcode(1464) : https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/description/

//Best solution : Submit maxproduct() function.

// Note : remove static from functions. Here are two solutions.
public class MaximumProductBubble1464 {
    public static void main(String[] args) {
        int[] arr = {5,4,2, 3};
        System.out.println(findProduct(arr));
        System.out.println(maxProduct(arr));
    }
//  Time complexity is O(n)^2

//    findProduct problem with edge cases but runtime is more than maxproduct.
    public static int findProduct(int[] arr) {

        if (arr.length > 1) {

            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int swap = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = swap;

                    }
                }

            }
            int a = arr[arr.length - 1] - 1;
            int b = arr[arr.length - 2] - 1;
            return a * b;
        } else {
            return arr[0]-1;
        }
    }



    //  Another solution using while loop it's not with edge cases.

    public static int maxProduct(int[] nums) {
        int i = 0;
        while(i < 2){
            int j = 1;
            while(j<nums.length){
                if(nums[j] < nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    j++;
                }
                else{
                    j++;
                }
            }
            i++;
        }
        return (nums[nums.length-2] - 1) * (nums[nums.length-1] - 1);
    }

}

