package COM.DSA_Searching;
import javax.sound.sampled.Line;
import java.util.*;
/*
 * Linear search is used for finding the element in array.
 * It is very simple but time consuming for large element array.
 * It starts search form index 0 to till end.
 * Time Complexity :
 * best case : O(1)
 *   when the element is find at index no 0;
 * Worst case : O(n)
 *   When the element is find at last index.
 *   when the element is not find in array{-1).
 * */

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr={1,23,45,33,455,6,-43,8};
        int target = -43;
        System.out.println(LinearSearch(arr, target));
        System.out.println(LinearSearchElement(arr, target));
    }

    // Q Search in the array : return the index if item found.
    //otherwiese if item is not found return -1.

    static int LinearSearch(int [] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            //check for element at every index if it is = target;

            int element = arr[index];
            if (element == target) {
                return index;
            }

        }
        return -1;// hence element is not find or not return state his hit in the function then the -1 will be return.
    }

// Q find the element and also return the element.

    static boolean LinearSearchElement(int [] arr, int target) {
        if (arr.length == 0) {
//            return Integer.MAX_VALUE;
            return false;
        }

        for (int element : arr) {


            if (element == target) {
                return true;
            }

        }
//        return Integer.MAX_VALUE;
        return false;
    }
}
