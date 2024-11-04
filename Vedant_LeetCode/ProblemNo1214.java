package COM.Vedant_LeetCode;
//Problem Link : https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/description/
//Note : Paste the code and remove static from functions.
public class ProblemNo1214 {
    public static void main(String[] args) {
        int no = 1;
        System.out.println(subtractProductAndSum(no));
    }
        public static int subtractProductAndSum(int n) {
            int sum = 0;
            int mul = 1;
            // Used if when no is 0 then mul is inititalized 1 and sum is 0, then mul-sum =1 but expected ans is 0.
            if(n==0){
                return 0;
            }
            else{
                while (n > 0) {
                    int remainder = n % 10; // get remainder means last digit.
                    sum = remainder + sum;
                    mul = mul * remainder;
                    n = n / 10; // cut the last no .
                }
            }
            return mul-sum;
        }
    }

