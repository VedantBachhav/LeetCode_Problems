package COM.Vedant_LeetCode;

//Problem solution and approach : https://leetcode.com/problems/valid-perfect-square/solutions/6104566/solve-with-100-00-ms-using-binary-search-approach/

//Problem link : https://leetcode.com/problems/valid-perfect-square/description/


public class Problem367_validsquare_BS {
    public static void main(String[] args) {
        int num = 16;
        System.out.println(isPerfectSquare(num));
    }
    public static boolean isPerfectSquare(int num) {

        long start = 0;
        long end = num/2;

        // if num is less than two for 0 and 1.
        if(num <2){
            return true;
        }

        while(start<=end){
            long mid = start+(end-start)/2;  // find mid

            long square = mid*mid;   // coutn squre used long if value exceed integer limit.

//            if square is equal to num then return true.
            if(square == num ){
                return true;
            }
//            if square is smaller than num then start = mid +1;
            else if(square < num){
                start = mid+1;
            }
//            if square is greater than num then end = mid -1;
            else{
                end = mid-1;
            }
        }
//        otherwise return false.
        return false;
    }
}
