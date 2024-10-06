package COM.DSA_Searching;
import  java.util.*;

public class CeilingUsingBs {
    public static void main(String[] args) {
        int [] arr = {1,2,4,5};
        int target = 3;

        System.out.println(ceiling(arr,target));

    }
    // ceiling means smallest number > = target.
    public static int ceiling(int [] arr, int target ){
        int start = 0 ;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start )/2;

            // but what if the target element is greater than gretest number in the array.-- see if statement

            if(target>arr[arr.length-1]){
                    return -1;
            }
            else if(arr[mid]==target){
//                mid = mid+1;
//                return arr[mid];
                return arr[mid];
            }
            else if (arr[mid]<target) {
                start = mid +1;
            }
            else{
                end = mid -1;
            }
        }
        return arr[start];
    }
}
