package COM.DSA_Array;

import java.util.Arrays;

public class SwapElementsInArray {
    public static void main(String[] args) {
        int [] arr = {12 ,23,25,41,20,56};
        System.out.println(Arrays.toString(arr));

        swap(arr,2,5);
        System.out.println("After change the value of index no 2 to index no 5");
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int []arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1]= arr[index2];
        arr[index2]= temp;
    }
}
