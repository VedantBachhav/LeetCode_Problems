package COM.Vedant_LeetCode;

//Problem LInk : https://leetcode.com/problems/sign-of-the-product-of-an-array/description/
//Solution Link : https://leetcode.com/problems/sign-of-the-product-of-an-array/solutions/6445910/solution-using-java-beats-100-with-0ms-r-c21f/

// beats 100% with 0ms

public class Problem1822SignofProductArray {
    public static void main(String[] args) {
        int [] nums = {-1,-2,-3,-4,3,2,1};
        System.out.println(arraySign(nums));
    }

//    when we done this problem using iterate and caluclate product then it shows error like overflow

    /*
    public static int arraySign(int[] nums) {
        int product = 1;
        for(int num : nums){
            product*=num;
        }
        return signFunc(product);
    }

    public int signFunc(int x){
        if(x==0){
            return 0;
        }
        else if(x>0){
            return 1;
        }
        else{
            return -1;
        }
    }*/

//    so it's optimized approach.
        public static  int arraySign(int[] nums) {
            int negativeCount = 0;

            for (int num : nums) {
                if (num == 0){
                    return 0;
                }
                if (num < 0) {
                    negativeCount++;
                }
            }
            if(negativeCount%2==0){
                return 1;
            }

            return -1;
        }
    }
