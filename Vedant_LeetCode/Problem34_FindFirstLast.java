package COM.Vedant_LeetCode;
// Problem no 34 link : https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/1414022303/
import java.util.Arrays;

public class Problem34_FindFirstLast {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 4, 5, 6};
        int target = 4;
        System.out.println(Arrays.toString(FirstLast(arr, target)));
    }

    // Function to return the first and last index of the target element
    public static int[] FirstLast(int[] arr, int target) {
        int[] ans = {-1, -1};

        // Check for first occurrence of target
        int start = search(arr, target, true);
        if (start == -1) {
            return ans; // Target not found, return [-1, -1]
        }

        // Check for last occurrence of target
        int end = search(arr, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    // Helper method to perform binary search
    static int search(int[] arr, int target, boolean findStartIndex) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1; // Move to the left half to find the start index
                } else {
                    start = mid + 1; // Move to the right half to find the end index
                }
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
