package COM.Vedant_LeetCode;

//Problme link :https://leetcode.com/problems/largest-odd-number-in-string/

//Solution link :https://leetcode.com/problems/largest-odd-number-in-string/solutions/6409832/java-100-beaats-easy-approach-for-findin-zwok/

public class Problem1903FindLargeOddNumInStr {
    public static void main(String[] args) {
        String str = "1234";
        System.out.println(largestOddNumber(str));
    }
    public static String largestOddNumber(String str) {

/* Brute force approach  - space and time complexity = O(N)

 public String largestOddNumber(String str) {
        char[] arr = str.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 2 != 0) {
                return new String(str.substring(0, i + 1));
            }
        }
        return "";
    }
*/

//        optimized approach time complexity is O(N) and space complexity is O(1)
        for (int i = str.length() - 1; i >= 0; i--) {
            if ((str.charAt(i) - 0) % 2 != 0) {
                return str.substring(0, i + 1);
            }
        }
        return "";
    }
}

