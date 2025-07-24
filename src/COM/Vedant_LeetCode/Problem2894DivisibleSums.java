package COM.Vedant_LeetCode;

// Problem Link : https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/description/?envType=problem-list-v2&envId=prshgx6i

// Solution Link :https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/solutions/6514950/super-easy-leetcode-problem-solved-using-eoow/

public class Problem2894DivisibleSums {
    public static void main(String[] args) {
        System.out.println(differenceOfSums(10,3));
    }

    public static int differenceOfSums(int n, int m) {
        int sum1=0, sum2=0;
        for(int i =0 ; i<=n; i++){
            if(i%m==0){
                sum2+=i;
            }
            else{
                sum1+=i;
            }
        }
        return sum1-sum2;
    }

}
