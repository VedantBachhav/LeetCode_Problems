package COM.DSA_Sorting;

import COM.DSA_Array.Array;

import java.util.Arrays;

// Implementation of Selection sort for sort an array.

// Basic idea : Pick the smallest element from unsorted array and put it at the beginning. (opp. of bubble sort)

// Time complexity = O(n^2)
// Space compexity = O(1)

public class SelectionSort {
    public static void main(String[] args) {
        int arr [] = {5,4,1,3,2};

        // call the functions.
        System.out.println("Sorted Array : "+ Arrays.toString(selectionSortAscending(arr)));
        System.out.println("Sorted Array : "+ Arrays.toString(selectionSortDescending(arr)));

    }


    public  static  int[] selectionSortAscending(int [] arr){
        System.out.println("Selection sort for Ascending Order");
        int i,j;
        for( i = 0 ; i<arr.length-1; i++ ){     // outer loop for iterate the array.
            int min_val = i ;                   // initialize index 1 to array.
            for( j = i +1; j<arr.length; j++){  // inner loop iterate the unsorted array.
                if(arr[min_val] > arr[j]){      // compare with unsorted part and if element is smaller then put at beginning.
                    min_val=j;                  // update the value of smallest element.
                }
            }
            // swap elements.
            int swap = arr[min_val];
            arr[min_val]=arr[i];
            arr[i]=swap;
            System.out.println("Pass : "+ Arrays.toString(arr));
        }
        return arr;
    }
    public static int[] selectionSortDescending(int [] arr){
        System.out.println("\nSelection sort for Descending Order");
        int i, j;
        for(i =0; i<arr.length-1;i++){
            int min_val =i;
            for(j=i+1;j<arr.length; j++){
                if(arr[min_val] < arr[j]){
                    min_val=j;
                }
            }
            int swap = arr[min_val];
            arr[min_val]=arr[i];
            arr[i]=swap;
            System.out.println("Pass : "+ Arrays.toString(arr));
        }
        return arr;
    }


}

