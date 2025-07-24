//package COM.Vedant_LeetCode;
//
////Solution Apporach link: https://leetcode.com/problems/guess-number-higher-or-lower/solutions/6105880/solution-with-100-0-ms-beat-with-screenshot-and-approach-in-java
//
////problme link = https://leetcode.com/problems/guess-number-higher-or-lower/description/
//
//public class Problem374_Guess_game extends GuessGame {
//    public static void main(String[] args) {
//    int num = 10;
//    int pick = 6;
//
//        System.out.println(guessNumber(num,pick));
//    }
//
//
////    paste code from here and read discription carefully.
//
////public class Solution extends GuessGame {
//
//    public static int guessNumber(int n, ) {
//
//        int start = 0;
//        int end = n;
//        while(start<=end){
//            int mid = start + (end-start)/2;
//
//            // if guess(mid) == 0 means picked right number.
//            if(guess(mid)==0){
//                return mid;
//            }
//            // if guess(mid) == -1 means picked number is less than mid.
//
//            else if(guess(mid)==-1){
//                end = mid-1;
//            }
//
//            // if guess(mid) == 1 means picked  number is greater than mid.
//
//            else{
//                start = mid+1;
//            }
//        }
//        return -1;
//    }
//
//}
