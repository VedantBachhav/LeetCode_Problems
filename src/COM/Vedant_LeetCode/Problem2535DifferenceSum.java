package COM.Vedant_LeetCode;

//Problem Link : https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/description/?envType=problem-list-v2&envId=prshgx6i

//Solution Link : https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/solutions/6616390/beats-100-easy-java-solution-with-two-op-g3sj/
public class Problem2535DifferenceSum {
    public static void main(String[] args) {
        int [] nums ={1,2,3,4};
        System.out.println(differenceOfSum1(nums));
        System.out.println(differenceOfSum(nums));
    }


// Easy solution but required 2 ms runtime and take less memory


     public static int differenceOfSum(int[] nums) {
         int sumDigit =0;
         int sumElement =0;
         for(int num : nums){
             sumElement += num;
             while(num>0){
                 int digit = num%10;
                 sumDigit += digit;
                 num = num/10;
             }
         }
         return sumElement-sumDigit;
     }



    // It also easy solution and takes slightly more memory and requires 1 ms runtime.
        public static int differenceOfSum1(int[] nums) {
            int sumElement = 0;
            int sumDigit = 0;
            for (int num : nums) {
                sumElement += num;
                sumDigit += sumOfDigits(num);
            }
            return sumElement - sumDigit;
        }

        private static int sumOfDigits(int num) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            return sum;
        }
    }


