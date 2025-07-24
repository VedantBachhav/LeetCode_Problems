package COM.DSA_Recursion;

import java.util.ArrayList;

public class LinearSearchArrayList {
    public static void main(String[] args) {
        int [] arr = {0,1,2,3,4,3,5};
        linearSearchAllIndex(arr,3,0);
        System.out.println(list);

        System.out.println(linearSearchWithParameter(arr, 3, 0, new ArrayList<Integer>())); // first way to passed list as argument

        ArrayList<Integer> ans = linearSearchWithParameter(arr, 3, 0, new ArrayList<>());  // second way
        System.out.println(ans);

        ArrayList<Integer> list1 = new ArrayList<>();
        linearSearchWithParameter(arr, 3, 0, list1);  // second way
        System.out.println(list1);

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


    // used Arraylist as a parameter
    public static ArrayList<Integer> linearSearchWithParameter(int [] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return linearSearchWithParameter(arr, target, index+1, list);
    }


}
