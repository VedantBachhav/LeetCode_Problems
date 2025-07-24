package COM.Vedant_LeetCode;

import java.util.Arrays;

public class R_Problem541ReverseString2 {
    public static void main(String[] args) {
        String str = "Vedant devidas ";
////        System.out.println(revere(str));0
//        String [] str1 = str.split(" ");
//        System.out.println(Arrays.toString(str1));
        System.out.println(reverseStr(str, 3));
    }

// **********  Brute force Approach  ********

    //    public static String reverseStr(String s, int k) {
//        StringBuilder sb1 =new StringBuilder();
//        int count=0;
//        if(s.length()<k){
//            return s;
//        }
//        for(int i=0; i<s.length()-1; i++){
//             if(count!=i){
//                sb1.append(s.charAt(i));
//            }
//
//            else if(count==i){
//
//             sb1.append(revere(s.substring(count,k+count)));
//                 i=k+count-1;
//
//                 count=count+2*k;
//            }
//
//        }
//        return sb1.toString();
//    }
//
//    public static  String revere(String s){
//        StringBuilder sb = new StringBuilder();
//        for(int i =s.length()-1; i>=0; i--){
//            sb.append(s.charAt(i));
//        }
//        return sb.toString();
//    }
    public static String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        for (int i = 0; i < n; i += 2 * k) {
            int left = i;
            int right = i + k - 1;
            if (right >= n) {
                right = n - 1;
            }
            while (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }

}

//*********************** Best and optimized solution ***********************
 /*
class Solution {
    public String reverseStr(String s, int k) {
        char[] str = s.toCharArray();
        int n = str.length;
        for(int i = 0 ; i <= n-1; i += 2*k){
            if(i+k-1 <= n-1){
                reverseK(i,i+k-1,str);
            }else{
                //for fewer than k characters left (edge case)
                reverseK(i,n-1,str);
            }
        }
        String ans = new String(str);
        return ans;
    }
    public void reverseK(int i, int j, char[] str){
        while(i < j){
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
    }
}

  */