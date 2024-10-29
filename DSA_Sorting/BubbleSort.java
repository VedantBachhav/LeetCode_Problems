package COM.DSA_Sorting;

import java.util.Arrays;

// Implementation of bubble sort.

// Time Complexity : O(n^2)
// Space Complexity : O(1)



public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 2, 0};
        System.out.println(Arrays.toString(codeForBubbleSort(arr)));
    }

    public static int[] codeForBubbleSort(int[] arr) {

        for (int tern = 0; tern < arr.length - 1; tern++) {    // First loop for pass.
            for (int j = 0; j < arr.length - 1 - tern; j++) {  // second loop for iterating elements.
                if (arr[j] > arr[j+1]) {                       // check if next element is small than current element then swap.
                    int swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;
                    System.out.println(Arrays.toString(arr)+ " Tern NO : "+tern + " | sub term : "+j);
                }
            }
        }

        return arr;
    }
}
