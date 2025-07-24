package COM.DSA_Sorting;
import java.util.*;

/*
Insertion sort for sorting an array.

Time complexity : worst case : O(N^2)    / Best case : O(N)
Space complexity : O(1)

basic Idea : Pick an element from unsorted part and place in the right position in sorted array.
 */

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {5,3,1,40,0,-2};
//        int num1 = 8;
//        int num2 = 12;
//        int res = (num1>num2) ? (num1+num2) : num1-num2;
//        System.out.println(res);
        System.out.println("Sorted Array - Ascending order : "+ Arrays.toString(insertionSortForAscending(arr)));
        System.out.println("Sorted Array - Descending order : "+ Arrays.toString(insertionSortForDescending(arr)));
    }

    // Function for Sort and array using insertion sort in Ascending order.
    public static int [] insertionSortForAscending(int [] arr){
            for(int i = 0 ; i<arr.length-1; i++){
                for(int j = i+1; j>0;j--){
                     if(arr[j]<arr[j-1]){
                        int swap = arr[j];
                        arr[j]=arr[j-1];
                        arr[j-1]=swap;
                    }
                    else{
                        break;
                    }
                }
            }

        return arr;
    }

    // Function for Sort and array using insertion sort in Descending order.
    public static int [] insertionSortForDescending(int [] arr){
        for(int i = 0 ; i<arr.length-1; i++){
            for(int j = i+1; j>0;j--){
                if(arr[j]>arr[j-1]){
                    int swap = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=swap;
                }
                else{
                    break;
                }
            }
        }

        return arr;
    }
}
