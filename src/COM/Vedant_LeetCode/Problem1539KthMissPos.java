package COM.Vedant_LeetCode;
//Solution link : https://leetcode.com/problems/kth-missing-positive-number/solutions/6133670/solution-beats-100-using-java-binary-search-approach/

//Problem link : https://leetcode.com/problems/kth-missing-positive-number/description/
public class Problem1539KthMissPos {
    public static void main(String[] args) {
        int [] arr = {2,3,4,7,11};
        int k = 5;
        System.out.println(findKthPositive(arr,k));

    }
    public static int findKthPositive(int[] arr, int k) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            System.out.println("mid " +mid);
            // Calculate the number of missing numbers before arr[mid]
            int missingCount = arr[mid] - (mid + 1);
            System.out.println("missing "+missingCount);

            if (missingCount < k) {
                // If less than k missing numbers, move to the right
                start = mid + 1;
                System.out.println("start" + start);
            } else {
                // Otherwise, move to the left
                end = mid - 1;
                System.out.println("end" +end);
            }
        }

        // At this point, `start` is the position where the kth missing number falls
        return start + k;

    }
}