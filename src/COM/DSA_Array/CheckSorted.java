package COM.DSA_Array;

public class CheckSorted {


        // Method to check if the array is sorted
        public static boolean isSorted(int[] arr) {
            // Traverse the array from the first element to the second last element
            for (int i = 0; i < arr.length - 1; i++) {
                // If the current element is greater than the next one, array is not sorted
                if (arr[i] > arr[i + 1]) {
                    return false;
                }
            }
            // If no elements are out of order, the array is sorted
            return true;
        }

        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};  // Example of a sorted array
            System.out.println("Is array sorted? " + isSorted(arr));

//            int[] arr2 = {5, 4, 3, 2, 1};  // Example of an unsorted array
//            System.out.println("Is array sorted? " + isSorted(arr2));
        }
    }

