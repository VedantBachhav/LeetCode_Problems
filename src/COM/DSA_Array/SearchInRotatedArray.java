package COM.DSA_Array;

public class SearchInRotatedArray {

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int pivot = pivotSearch(arr);

//        three cases for search element in rotate array.

//        case 1 : If array is not rotated.
        if (pivot == -1) {
            System.out.println(binarySearch(arr, 0, arr.length - 1, target));
        }
//        case 2 : if pivot is found it is equal to target;
        if(arr[pivot]==target){
            System.out.println(pivot);
        }
//        case 3 : if pivot is no t equal to target then search  2 asc array
//         case 3.1 : search in before pivot element means left side of ascending array.
        if(target>=arr[0]) {
            System.out.println(binarySearch(arr, 0, pivot - 1, target));
        }
//         case 3.2 : search in 2 asc array that is after pivot element means right ascending array.

        else{
            System.out.println(binarySearch(arr, pivot + 1, arr.length - 1, target));
        }
    }

    static int pivotSearch(int arr []){
        int start = 0 ;
        int end = arr.length-1;

        while(start<= end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1] && mid < end){  // used edge case for not exceding range i.e end > mid
                return mid;
            }
            if(arr[mid]>arr[mid-1] && mid > start){ // used edge case for not exceding range i.e start < mid
                return arr[mid];
            }
            if (arr[start] >= arr[mid]) {
                end = mid -1;
            }
            else{
                start= mid+1;
            }
        }
        return -1;
    }

    static int binarySearch(int arr [] , int start, int end, int target){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]== target){
                return mid;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start= mid+1;
            }
        }
        return -1;
    }
}

