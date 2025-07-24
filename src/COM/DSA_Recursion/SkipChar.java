package COM.DSA_Recursion;

public class SkipChar {
    public static void main(String[] args) {
        String str = "abcdabacdd";
        String str1= "";
        String str2 = "ascdappqleae";
//        skipChar(str1,str);
//        System.out.println(str1);
        System.out.println(skipChar(str));
        System.out.println(skipWord(str2));
        System.out.println(skipAppNotApple(str2));
    }
    public static void skipChar(String empty, String str){
        if(str.isEmpty()){
            System.out.println(empty);
            return;
        }
        char ch = str.charAt(0);

        if(ch=='a'){
            skipChar(empty,str.substring(1));
        }
        else{
            skipChar(empty+ch, str.substring(1));
        }
    }


    public static String skipChar(String str){
        if(str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);

        if(ch=='a'){
          return skipChar(str.substring(1));
        }
        else{
          return ch+skipChar( str.substring(1));
        }
    }


    public static String skipWord(String str ){
        if(str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);
//        in this problem we will skip a whole word from our string we take apple and we skip apple
        if(str.startsWith("apple")){
            return skipWord(str.substring(5));

        }
        else{
            return ch+skipWord(str.substring(1));
        }
    }


    // we solve another problem when we want skip app not a apple ;

    public static String skipAppNotApple(String str2){
        if(str2.isEmpty()){
            return "";
        }

        char ch = str2.charAt(0);

        if(str2.startsWith("app") && !str2.startsWith("apple")){
            return skipAppNotApple(str2.substring(3));
        }
        else{
            return ch+skipAppNotApple(str2.substring(1));
        }
    }


}
