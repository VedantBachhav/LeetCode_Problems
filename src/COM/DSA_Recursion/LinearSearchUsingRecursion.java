package COM.DSA_Recursion;

import java.util.ArrayList;

public class LinearSearchUsingRecursion {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3,5,9};
        System.out.println(linearSearchIndex(arr,19,0));
        System.out.println(linearSearchIndexFirst(arr,19,0));
        System.out.println(linearSearchIndexLast(arr,9,arr.length-1));


    }
    public  static boolean linearSearchIndex(int [] arr, int target, int index) {
        if(index==arr.length){
            return false;
        }

        return arr[index]==target || linearSearchIndex(arr, target, index+1);
    }
    public  static int linearSearchIndexFirst(int [] arr, int target, int index) {
        if(index>arr.length-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return linearSearchIndexFirst(arr, target, index+1);
    }
    public  static int linearSearchIndexLast(int [] arr, int target, int index) {
        if(index<0){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return linearSearchIndexLast(arr, target, index-1);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    public static void linearSearchAllIndex(int []arr, int target, int index){
        if(index == arr.length){
            return;
        }
        if(arr[index]==target){
            list.add(index);
        }
        linearSearchAllIndex(arr, target, index+1);
    }


}
