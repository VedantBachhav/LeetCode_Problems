package COM.Vedant_LeetCode;
import java.util.*;

//Problem Link : https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/solutions

//Solution Link :https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/solutions/6441641/java-solution-2ms-run-time-with-easy-ste-cfq4/

public class Problem2114MaxNoOfSentence {
    public static void main(String[] args) {
        String [] arr = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(arr));
        System.out.println(mostWordsFound1(arr));
    }


//    best approach beats 98 % with run time 2ms
    public static int mostWordsFound(String[] sentences) {

        int maxCount =0;
        for(String str : sentences){
            int count = 1;
            for(char ch : str.toCharArray()){
                if(ch==' '){
                    count++;
                }
                maxCount = Math.max(maxCount,count);
            }
        }
          return maxCount;
    }

    // beats only 83percent and space complexity is also high
    public static int mostWordsFound1(String[] sentences) {

        int maxCount =0;
        for(String str : sentences){
            int count = str.split(" ").length;
            if (maxCount<count){
                maxCount=count;
            }
            }


        return maxCount;
    }


}
