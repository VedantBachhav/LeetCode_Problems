package COM.Vedant_LeetCode;

//Problem link : https://leetcode.com/problems/check-balanced-string/description/

//Level : Easy

//Solution link with Approach :https://leetcode.com/problems/check-balanced-string/solutions/6395195/solution-using-java-beats-9926-people-by-p8go/

public class Problem3380_BalancedString {
    public static void main(String[] args) {
        String Str = "1232";
        System.out.println(isBalanced(Str));
    }

    public static boolean isBalanced(String num) {
        int SumEven =0;
        int SumOdd =0;
        for(int i = 0;  i<num.length(); i++) {
            if (i % 2 == 0) {
                char ch = num.charAt(i);
                SumEven += ch - '0';
            } else {

                return false;
            }
        }
        return true;
}
        }
