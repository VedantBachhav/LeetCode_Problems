package COM.Vedant_LeetCode;
import java.util.*;


//Problem Link : https://leetcode.com/problems/plus-one/description/
//Note : Paste the optimized code and remove static from functions .

public class Problem66_PlusOne {
    public static void main(String[] args) {
        int [] digits = {1,2,3,9};
        int len = digits.length-1;
        System.out.println(Arrays.toString(plusOne(digits)));
    }

        public static int[] plusOne(int[] digits) {
            /*  // Brute force approach with ASC order.

            int len = digits.length-1;
            int last_no = digits[len]%10;

            if(last_no == 9){
                int [] arr = new int[len+2];
                digits[len]=digits[len]+1;
                last_no=digits[len]/10;

                digits[len]=last_no;
                for(int i = 0; i<arr.length-1; i++){
                    arr[i]=digits[i];
                }
                arr[arr.length-2]=last_no;
                arr[arr.length-1]=0;
                return arr;

            }
            else{
                digits[len] = digits[len]+1;
            }
            return digits;*/

//            BEST SOLUTION AND ACCEPTED WITH 0 MS. Optimized Solution .

            for (int i = digits.length - 1; i >= 0; i--) {
                if (digits[i] < 9) {
                    digits[i]++;
                    return digits;
                }
                digits[i] = 0;
            }

            digits = new int[digits.length + 1];
            digits[0] = 1;
            return digits;



    }
}
