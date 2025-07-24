package COM.Vedant_LeetCode;
import  java.util.*;

//Solution Approach : https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/solutions/6054858/solution-with-brute-force-approach/

//Problem link : https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/



public class Problem1365_SmallersNoInArray {
    public static void main(String[] args) {
        int [] nums = {8,1,2,2,3};
        // expected output : [4,0,1,1,3]
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
        /*
        Explanation:
            For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
            For nums[1]=1 does not exist any smaller number than it.
            For nums[2]=2 there exist one smaller number than it (1).
            For nums[3]=2 there exist one smaller number than it (1).
            For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
         */

    }
    // Solution with Brute force Approach.
    public static int[] smallerNumbersThanCurrent(int[] arr) { // remove static
        int [] nums = new int[arr.length];
        for(int no = 0; no<arr.length; no++){
            int sum = 0;
            for(int j = 0; j<arr.length; j++){
                if(arr[no]>arr[j]){
                    sum = sum+1;
                }
            }
            nums[no]=sum;
        }
        return nums;
    }
}
