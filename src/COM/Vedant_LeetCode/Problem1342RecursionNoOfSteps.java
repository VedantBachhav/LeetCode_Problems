package COM.Vedant_LeetCode;

//Solution link : https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/solutions/6719662/beats-100-solved-using-java-used-recursi-dhf7/

//Problem link : https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/

public class Problem1342RecursionNoOfSteps {

        public static int numberOfSteps(int num) {
            return helper(0, num);

        }

        private static int helper(int count, int num) {

            if (num == 0) { //base case
                return count;
            }

            if (num % 2 == 0) { // even case
                return helper(count + 1, num / 2);
            } else { // odd case
                return helper(count + 1, num - 1);
            }
        }


    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }
}
