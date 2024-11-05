package COM.Vedant_LeetCode;
//Problem link : https://leetcode.com/problems/shuffle-the-array/description/
//Approch : https://leetcode.com/problems/shuffle-the-array/solutions/6011398/solve-with-easy-approach-and-beats-100

import java.util.Arrays;

// Note : remove static before paste function.
public class Problem1470_ShuffleArray {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6}; // output [1,4,2,5,3,6]
        int n =3;
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int [] result = new int[n*2];
        int x=0;
        int y=n;
        for(int i =0; i<n*2; i++){
            if(i%2==0){
                result[i]=nums[x];
                x++;
            }
            else{
                result[i]=nums[y];
                y++;
            }
        }
        return result;
    }
}
