package COM.DSA_Recursion;

import java.util.Arrays;

// need revision

// merge sort is better than quich sort because it has fix time complexith O(n * log n)
// but quick sort have o(N^2) in worst case

public class QuickSort {
    public static void main(String[] args) {
        int [] arr = {15,4,12,3,2,10};
        quickSort(arr, 0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int [] arr, int start, int end){
        int s = start;
        int e = end;
        int mid = s + (e-s)/2;
        int pivot = arr[mid];
        if(start>=end){
            return ;
        }
        while(s<=e){
            while(arr[s]<pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }

            if(s<=e){
                int temp = arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        // now my pivot is at correct index, so sort  two halves now
        quickSort(arr, start, e);
        quickSort(arr,s,end);

    }
}
