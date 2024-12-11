package COM.Vedant_LeetCode;

import java.util.Locale;

public class Problem125PalindromeStirng {
    public static void main(String[] args) {
        String str ="A man, a plan, a canal: Panama";


        System.out.println(stringFind(str));

    }

//    public static boolean stringFind(String s){
//        String str1 = s.toLowerCase();
//
//        String str = str1.replaceAll(
//                "[^a-zA-Z0-9]", "");
//        System.out.println(str);
//        int start = 0;
//        int end = str.length()-1;
//        while(start<end){
//            if(str.charAt(start)==str.charAt(end)){
//                start++;
//                end--;
//            }
//            else{
//                return false;
//            }
//        }
//        return true;
//    }

// update solution with good complexity
    public static boolean stringFind(String s) {
        if (s == null || s.isEmpty()) {
            return false; // Handle null or empty input
        }

        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            while (start < end && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }
            while (start < end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }

            if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

}