package COM.DSA_Sorting;

import java.util.Arrays;

// Note : When given numbers from range 1 to N then used cyclic sort.

//Time complexity = O(N) used only one loop.
//Space complexity = O(1)

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,4};
        System.out.println(Arrays.toString(cyclicSort(arr)));
    }

    static int[] cyclicSort(int[] arr) {

        // using for loop
      for(int i = 0; i<arr.length;) { // if element is equal then increment for loop in else case.
          int index = arr[i] - 1;
          if (arr[index] != arr[i]) {
              int swap = arr[i];
              arr[i] = arr[index];
              arr[index] = swap;
          }
          else{
              i++;
          }

      }


            // using while loop
//            int i =0;
//            while(i<arr.length) {
//                int correct = arr[i] - 1;
////                System.out.println(correct);
//                if (arr[correct] != arr[i]) {
//                    int swap = arr[i];
//                    arr[i] = arr[correct];
//                    arr[correct] = swap;
//                } else {
//                    i++;
//                }
//            }
            return arr;

        }

}
