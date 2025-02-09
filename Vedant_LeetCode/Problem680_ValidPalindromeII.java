package COM.Vedant_LeetCode;

//problem link  :https://leetcode.com/problems/valid-palindrome-ii/description/?envType=problem-list-v2&envId=string


// **** Need to rivision. ****
public class Problem680_ValidPalindromeII {
    public static void main(String[] args) {
        String s="aeedeceeea";
        System.out.println(validPalindrome(s));
    }

        public static boolean validPalindrome(String s) {
            return isPalindrome(s, 0, s.length() - 1, 1);
        }

        private static boolean isPalindrome(String s, int left, int right, int count) {
            while(left<right){
                if(s.charAt(left)!=s.charAt(right)){
                    if(count==0){
                        return false;
                    }

                    return isPalindrome(s, left + 1, right, count - 1) || isPalindrome(s, left, right - 1, count - 1);

                }
                left++;
                right--;
            }
            return true;
        }



//        public static boolean validPalindrome(String s) {
//            int count = 1;
//            for(int index= 0; index<s.length()/2; index++){
//                if(s.charAt(index)==s.charAt(s.length()-1-index)){
//                }
//
//                else if(s.length()>3 && count==1){
//
//                    count--;
//                }
//                else{
//                    return false;
//                }
//
//            }
//            return true;
//
//    }


}
