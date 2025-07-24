package COM.Vedant_LeetCode;
import  java.util.*;

//Problem link :https://leetcode.com/problems/remove-element/

//Solution Link : https://leetcode.com/problems/remove-element/solutions/6446495/simple-java-solution-beats-100-with-0ms-1jd9b/

public class Problem27RemoveElements {
    public static void main(String[] args) {
        int [] arr = {3,2,2,3};
        int val = 3;
        System.out.println(removeElement(arr,val));

    }
    public static int removeElement(int[] nums, int val) {
        int no = 0;

        for(int i =0; i<nums.length; i++){
            if(nums[i]!=val){
                nums[no]=nums[i];
                no++;
            }
        }
//        System.out.println(Arrays.toString(nums));
        return no;
    }
}