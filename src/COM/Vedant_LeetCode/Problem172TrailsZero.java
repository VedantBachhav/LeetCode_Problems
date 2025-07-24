package COM.Vedant_LeetCode;

//Problem link : https://leetcode.com/problems/factorial-trailing-zeroes/description/?envType=study-plan-v2&envId=top-interview-150

//Solution Link : https://leetcode.com/problems/factorial-trailing-zeroes/solutions/6612581/beats-100-using-java-easy-approach-using-01so/

public class Problem172TrailsZero {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(trailingZeroes(n));

    }

        public static int trailingZeroes(int n) {
            int count = 0;
            while (n >= 5) {
                n = n / 5;
                count += n;
            }
        return  count;
        }
}
