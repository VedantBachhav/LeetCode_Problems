package COM.Vedant_LeetCode;
//Solution Apprach link : https://leetcode.com/problems/add-digits/solutions/6046998/solve-with-o-1-time-complexity-with-0-ms-runtime
//Problem link : https://leetcode.com/problems/add-digits/description/

public class Problem258_AddDigits {
    public static void main(String[] args) {
        int num = 245;
//        ans = 2

        System.out.println(addDigits(num));
    }
    public static int addDigits(int num) {
        if (num == 0) {
            return 0;
        }
        if (num % 9 == 0) {
            return 9;
        } else {
            return num % 9;
        }
    }
}

