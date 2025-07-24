package COM.Vedant_LeetCode;

import java.util.Arrays;

// Problem Link : https://leetcode.com/problems/running-sum-of-1d-array/description/\
// Level : Easy
// Note : Paste only function inside solution class on leetcode and remove static keyword.
public class SumOf1DArray1480 {
    public static void main(String[] args) {
        /*
        Input: nums = [1,2,3,4]
        Output: [1,3,6,10]
        Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
         */
        int arr[] = {1,2,3,4};

        System.out.println(Arrays.toString(runningSum(arr)));

    }

    public static int[] runningSum(int[] arr) {
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum=sum+arr[i];
            arr[i]=sum;
        }
        return arr;
    }
}