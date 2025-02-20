package COM.Vedant_LeetCode;

//Problem Link : https://leetcode.com/problems/find-unique-binary-string/description/

//Problem Solution Link : https://leetcode.com/problems/find-unique-binary-string/solutions/6445484/beats-100-easy-solution-using-java-by-ve-hydo/

public class Problem1980UniqueBinaryStr {
    public static void main(String[] args) {
        String []  nums = {"111","011","001"};
        System.out.println(findDifferentBinaryString(nums));

    }

    public static String findDifferentBinaryString(String[] nums) {
        StringBuilder result = new StringBuilder("");
        for(int i = 0; i<nums.length; i++){
            if(nums[i].charAt(i)=='1'){
                result.append('0');
            }
            else{
                result.append('1');
            }
        }
        return result.toString();
    }
}
