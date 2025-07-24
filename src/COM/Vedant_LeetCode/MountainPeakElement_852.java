package COM.Vedant_LeetCode;

//Problem link : https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

public class MountainPeakElement_852 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 8, 7, 4, 2, 0};
        System.out.println(PeakElement(arr));

    }
        public static int PeakElement( int[] arr){
            int start = 0;
            int end = arr.length - 1;
            while (start < end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] > arr[mid + 1]) {
                    end = mid;
                } else {
                    start = mid + 1;
                }


            }
            return end;// ans will be end == start so we also print end for the answer
        }

}
