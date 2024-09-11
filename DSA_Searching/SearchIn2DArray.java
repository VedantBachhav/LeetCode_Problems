package COM.DSA_Searching;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        // Initialize 2D array
        int[][] arr = {
                {12, 23, 43, 90},
                {25, 36, 89},
                {20, 10},
                {145, 250, 289, -10}
        };

        // Target element to search for
        int target = 10;

        // Search for the target in the array
        int[] ans = search(arr, target); // Format of return value: (row, col)

        // Print the result
        System.out.println(Arrays.toString(ans));
    }

    // Method to search for the target element in a 2D array
    static int[] search(int[][] arr, int target) {
        // Loop through each row
        for (int row = 0; row < arr.length; row++) {
            // Loop through each column in the current row
            for (int col = 0; col < arr[row].length; col++) {
                // If target is found, return its position as a (row, col) pair
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        // If target is not found, return [-1, -1]
        return new int[]{-1, -1};
    }
}
