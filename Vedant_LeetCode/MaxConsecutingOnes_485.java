package COM.Vedant_LeetCode;
import  java.util.*;
// Count Max consecuting ones in array: [0,1,1,1,0,0,1,1,0,1,1,1,1] ans is 4;
//Problem Link : https://leetcode.com/problems/max-consecutive-ones/description/

//Note : Paste the code and remove static from functions.

public class MaxConsecutingOnes_485 {
    public static void main(String[] args) {
        int [] nums ={1,0,1,1,1,1,0,0,1,1,0};
        System.out.println("Max Consecutive Ones : "+ findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int nums[]) {
            int count = 0;
            int max_count = 0;
            for(int i =0; i<nums.length;i++){

                if(nums[i]==1){
                    count++;
                }
                else{
                    count =0;
                }
                max_count=Math.max(max_count,count);
            }
            return max_count;
    }
}