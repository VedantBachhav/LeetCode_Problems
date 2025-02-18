package COM.Vedant_LeetCode;

//Problem Link : https://leetcode.com/problems/type-of-triangle/description/
//Solution Link : https://leetcode.com/problems/type-of-triangle/solutions/6437931/solved-with-o1-time-space-complexity-bea-939e/

public class Problem3024TypesOfTriangle {
    public static void main(String[] args) {

    int [] arr = {10,5,10};
        System.out.println(triangleType(arr));
}
    public static String triangleType(int[] nums) {
        if(nums[0]+nums[1]<=nums[2] || nums[1]+nums[2]<=nums[0] || nums[0]+nums[2]<=nums[1]){
            return "none";
        }

        else if(nums[0]==nums[1] && nums[1]==nums[2]){
            return "equilateral";
        }
        else if(nums[0]==nums[1] || nums[1]==nums[2] || nums[0]==nums[2] ){
            return "isosceles";
        }
        else{
            return "scalene";
        }

    }
}
