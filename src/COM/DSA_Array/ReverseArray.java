package COM.DSA_Array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr = {1,2 ,3 ,4,5,6,7};
        reverse(arr);


        System.out.println(Arrays.toString(arr));

    }
    static void reverse(int [] arr){
        int start =0;
        int end = arr.length-1;
        while(start < end){
            int swap = arr[start];
            arr[start]=arr[end];
            arr[end]=swap;
            start ++;
            end --;
        }
    }

}
