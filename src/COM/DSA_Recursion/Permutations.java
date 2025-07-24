package COM.DSA_Recursion;

import COM.DSA_Array.Array;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        permutations("","abc");
        System.out.println(permutationsUsingArraylist("","abc"));
    }
    public static void permutations(String copy, String original){
        if(original.isEmpty()){
            System.out.println(copy);
            return;
        }
        char ch = original.charAt(0);
        for(int i =0 ; i<=copy.length();i++){
            String f = copy.substring(0,i);
            String s = copy.substring(i,copy.length());
            permutations(f+ch+s, original.substring(1));
        }
    }

    public static ArrayList<String> permutationsUsingArraylist(String copy, String original){
        if(original.isEmpty()){
//            System.out.println(copy);
            ArrayList<String> list = new ArrayList<>();
            list.add(copy);
            return list;
        }
        char ch = original.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for(int i =0 ; i<=copy.length();i++){
            String f = copy.substring(0,i);
            String s = copy.substring(i,copy.length());
            ans.addAll(permutationsUsingArraylist(f+ch+s, original.substring(1)));
        }
        return  ans;
    }


}
