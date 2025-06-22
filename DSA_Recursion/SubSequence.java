package COM.DSA_Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class SubSequence {
    public static void main(String[] args) {
        subSequences("","123");
        System.out.println(subSequencesUsingArrList("","abc"));
        subSequencesAscii("","abcd");
    }
    public static void subSequences(String str, String original){
        if(original.isEmpty()){
            System.out.println(str);
            return;
        }

        char ch = original.charAt(0);
        subSequences(str+ch, original.substring(1));
        subSequences(str, original.substring(1));
    }

    public static ArrayList<String> subSequencesUsingArrList(String str,String original){
        if(original.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(str);
            return list;
        }
        char ch = original.charAt(0);
        ArrayList<String> left= subSequencesUsingArrList(str+ch,original.substring(1));
        ArrayList<String> right = subSequencesUsingArrList(str,original.substring(1));
        left.addAll(right);;
        return left;
    }

    public static void subSequencesAscii(String str, String original){
        if(original.isEmpty()){
            System.out.println(str);
            return;
        }

        char ch = original.charAt(0);
        subSequencesAscii(str+ch, original.substring(1));
        subSequencesAscii(str, original.substring(1));
        subSequencesAscii(str+(ch+0), original.substring(1));
    }

}
