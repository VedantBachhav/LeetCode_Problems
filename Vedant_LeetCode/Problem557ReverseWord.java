package COM.Vedant_LeetCode;

//Problem Link : https://leetcode.com/problems/reverse-words-in-a-string-iii/description/

//Solution Link  : https://leetcode.com/problems/reverse-words-in-a-string-iii/solutions/6407680/solution-with-java-easy-and-optimized-ap-do3d/

public class Problem557ReverseWord {
    public static void main(String[] args) {
        String str = "Let's Vedant Devidas Bachhav";
        System.out.println(reverseWords(str));
    }
    public static String reverseWords(String s) {
        String [] arr = s.split(" ");
        StringBuilder sb = new StringBuilder("");
        for(int index = 0; index<arr.length; index++){
            sb.append(reverseStr(arr[index]));
            if(index<arr.length-1){
                sb.append(" ");
            }
            }
        return sb.toString();
        }

    public  static String reverseStr(String s){
        char [] word = s.toCharArray();
        int start =0;
        int end = word.length-1;

        while(start<end){
            char temp = word[start];
            word[start]=word[end];
            word[end]=temp;
            start++;
            end--;
        }
        return new String(word);
    }

}