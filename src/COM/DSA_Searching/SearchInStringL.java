package COM.DSA_Searching;

import java.util.Arrays;

public class SearchInStringL {
    public static void main(String[] args) {
        String str = "Vedant Bachhav";
        char target = 'B';
        System.out.println(Arrays.toString(str.toCharArray()));
        System.out.println(SearchStr(str, target));
        System.out.println(SearchStr2(str, target));
//        toCharArray() is used for making string in array format.

    }
//Q    check the char in the string with index number.
        static boolean SearchStr(String str,  char target){
            if(str.length()==0){
                return false;
            }
            for (int i =0; i< str.length(); i++){

                if(target==str.charAt(i)) {
                    System.out.println(i);
                    return true;
                }
            }
            return false;
        }


        /*Also check the char is availabel in the string using for each loop.*/

    static boolean SearchStr2(String str,  char target){
        if(str.length()==0){
            return false;
        }
        for (int ch : str.toCharArray()){

            if(target==ch) {

                return true;
            }
        }
        return false;
    }
    }

