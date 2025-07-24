package COM.DSA_Array;

public class PivotInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        // our pivot element is 7 at index no 3;

        System.out.println("Pivot element is  : "+findPivot(arr));

    }

    static int findPivot(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

//      4 Cases of finding pivot is here.
//           case 1
            if (mid > end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
//           case 2
            if (mid > start && arr[mid] > arr[mid - 1]) {
                return mid;
            }
//           case 3
            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            }

//           case 4 its also a else part.
            if (arr[start] <= arr[mid]) {
                start = mid + 1;
            }
        }
        return -1;

    }
}
