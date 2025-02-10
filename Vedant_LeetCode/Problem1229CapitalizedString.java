package COM.Vedant_LeetCode;

//Problem link : https://leetcode.com/problems/capitalize-the-title/description/

//Solution Link : https://leetcode.com/problems/capitalize-the-title/solutions/6404740/solution-with-java-using-optimized-appro-889q/
public class Problem1229CapitalizedString {
    public static void main(String[] args) {
        String str = "i capiTalIze He titLe";

        System.out.println(toCaptalized(str));
    }
    public static String toCaptalized(String str){
        String [] word  = str.toLowerCase().split(" ");
        StringBuilder sb= new StringBuilder("");
        for(int i =0; i<word.length;i++){
            if(word[i].length()>2){
                sb.append(Character.toUpperCase(word[i].charAt(0))).append(word[i].substring(1));
            }
            else{
                sb.append(word[i]);
            }
            if(i<word.length-1){
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}
