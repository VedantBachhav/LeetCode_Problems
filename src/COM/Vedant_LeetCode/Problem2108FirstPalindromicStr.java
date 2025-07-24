package COM.Vedant_LeetCode;

//Problem link : https://leetcode.com/problems/find-first-palindromic-string-in-the-array/description/

//Problem Soution Link : https://leetcode.com/problems/find-first-palindromic-string-in-the-array/solutions/6445813/easy-java-solution-beats-100-optimized-a-0c2s/

public class Problem2108FirstPalindromicStr {
    public static void main(String[] args) {
        String [] words = {"notapalindrome","racecar"};
        System.out.println(firstPalindrome(words));
        System.out.println(firstPalindromeOptimized(words));

    }


    // Brute Force approch runtime 2ms beats 63%.
    public static String firstPalindrome(String[] words) {
        for (int i = 0; i < words.length; i++) {
            int count = 0;
            for (int j = 0; j < words[i].length(); j++) {
                if (words[i].charAt(j) != words[i].charAt(words[i].length() - 1 - j)) {
                    break;
                } else {
                    count++;
                }
            }
            if (count == words[i].length()) {
                return words[i];
            }
        }
        return "";
    }


    // Optimized approach : 1ms beats 100%
    public static String firstPalindromeOptimized(String [] words) {
        for(String str : words){
            if(isPalindrome(str)){
                return str ;
            }
        }
        return "";
    }
    public static boolean isPalindrome(String str){
       for(int index = 0 ; index<str.length()/2; index++){
           if(str.charAt(index)!=str.charAt(str.length()-1-index)){
               return false;
           }
       }
       return true;
    }

}
