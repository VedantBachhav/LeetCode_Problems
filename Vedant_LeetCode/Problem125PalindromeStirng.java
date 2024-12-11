package COM.Vedant_LeetCode;

public class Problem125PalindromeStirng {
    public static void main(String[] args) {
        String str = "madam";
        System.out.println(stringFind(str));
    }

    public static boolean stringFind(String str){

        int start= 0;
        int end=str.length()-1;
        while(start<end) {
            if (str.charAt(start) == str.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;

    }


}
