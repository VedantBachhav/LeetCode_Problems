package COM.Vedant_LeetCode;
// Problem Link : https://leetcode.com/problems/sum-multiples/description/?envType=problem-list-v2&envId=prshgx6i
//Solution link : https://leetcode.com/problems/sum-multiples/solutions/6499330/easy-java-solution-beats-100-by-vedant_b-ovcu/

// beats 95.33% peoples with 2 ms run time.
public class Problem2653SumMultiplies {

    public static void main(String[] args) {
        System.out.println(sumOfMultiples(3));
    }

        public static int sumOfMultiples(int n) {
            int sum =0;
            for(int i =3; i<=n; i++){
                if(i%3==0 || i%5==0 || i%7==0){
                    sum+=i;
                }
            }
            return sum;
        }
    }

