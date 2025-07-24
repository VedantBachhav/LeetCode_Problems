package COM.Vedant_LeetCode;
import java.util.*;

//Problem Link : https://leetcode.com/problems/minimum-number-game/description/

//Solution Link : https://leetcode.com/problems/minimum-number-game/solutions/6434973/easy-java-solution-with-sorting-approach-q3y4/

public class Problem2974MinNumGame {
    public static void main(String[] args) {
        int [] arr = {4,5,2,3};
        System.out.println(Arrays.toString(numberGame(arr)));
    }
    public static int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int [] arr = new int[n];

        for(int i =0; i<arr.length; i+=2){
            arr[i]=nums[i+1];
            arr[i+1]=nums[i];

        }
        return arr;
    }
}


