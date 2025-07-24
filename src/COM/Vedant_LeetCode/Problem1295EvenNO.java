package COM.Vedant_LeetCode;

//problem link :  https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

public class Problem1295EvenNO {
    public static void main(String[] args) {
        int [] nums ={12,345,2,6,7896};
        System.out.println(findNumbers(nums));
        System.out.println(digits2(12546));
    }

    static int findNumbers(int [] nums){
        int count = 0;
        for (int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    //function to check wheather the no. contains even digit or not.
    static boolean even(int num){
        int numberOfDigit = digits(num);
        return numberOfDigit % 2 ==0;
    }

    // count number of digits in a number.
    static  int digits(int num){
        int count =0;
        while (num>0){
            count++;
            num=num/10;
        }
        return count;
    }


    // second way with optimized solution.
    static int digits2(int num){
        if(num<0){
            num=num * -1;
        }
        return (int) (Math.log10(num));
    }

}
