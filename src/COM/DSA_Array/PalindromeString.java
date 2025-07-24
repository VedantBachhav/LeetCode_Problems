package COM.DSA_Array;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "madam";
        System.out.println(PalindromeStr(str));

    }
    public static boolean PalindromeStr(String str){
        if(str==null || str.length()==0){
            return true;
        }

        for(int i =0; i<=str.length()/2; i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if(start!=end){
                return false;
            }
        }
        return true;
    }
}
