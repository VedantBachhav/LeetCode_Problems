package COM.DSA_Recursion;

import java.util.Arrays;

public class BubbleSortUsingRecursion {
    public static void main(String[] args) {
        int [] arr = {4,3,2,1};
        System.out.println(Arrays.toString(bubbleSort(arr,arr.length-1,0)));

        // used when we used void
//        bubbleSort(arr,arr.length-1,0);
//        System.out.println(Arrays.toString(arr));
    }
    static  int[] bubbleSort(int [] arr, int pass, int innerPass2) {
        if (pass == 0) {
            return arr;
        }
        if (pass > innerPass2) {
            if (arr[innerPass2] > arr[innerPass2 + 1]) {
                int temp = arr[innerPass2];
                arr[innerPass2] = arr[innerPass2 + 1];
                arr[innerPass2 + 1] = temp;
            }
           return bubbleSort(arr, pass, innerPass2 + 1);
        } else {
            return bubbleSort(arr, pass - 1, 0);
        }
    }
}
