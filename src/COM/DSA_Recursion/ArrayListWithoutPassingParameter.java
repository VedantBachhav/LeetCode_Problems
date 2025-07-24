package COM.DSA_Recursion;

import java.util.ArrayList;

public class ArrayListWithoutPassingParameter {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,5,6,5};
        System.out.println(arrayListWithoutParameter(arr,7,0));

    }

    // This is not a optimised approach like passing parameter as arraylist or intialize static arraylist.

    static ArrayList<Integer> arrayListWithoutParameter(int [] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length){
            return list;
        }

        // this will contain only answer in the list
        if(arr[index]==target){
            list.add(index);
        }

        // making list for add all below function call lists. --> connect list

        ArrayList<Integer> ans = arrayListWithoutParameter(arr, target, index+1);
        list.addAll(ans);
        return list;
    }

}
