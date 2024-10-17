package COM.Vedant_LeetCode;

// Leetcode Problem link : https://leetcode.com/problems/search-in-rotated-sorted-array/

//Note : paste code below from searchElement() function and remove static keyword from all functions.

public class SearchInRotatedArray_33 {
    public static void main(String[] args) {
        int [] arr ={6,7,1,2,3,4,5};
        int target = 6; // ans should be index no 5
        System.out.println(searchElement(arr,target));

    }

    public static int searchElement(int arr[], int target){
        int pivotelement=findPivot(arr);

        if(pivotelement == -1){
            return binarySearch(arr, target,0, arr.length-1);
        }
        if(arr[pivotelement] == target){
            return pivotelement;
        }
        if(target>=arr[0]){
            return binarySearch(arr,target,0,pivotelement-1);

        }
        else{
            return binarySearch(arr,target,pivotelement+1,arr.length-1);

        }

    }

    public static int findPivot(int arr[] ){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(mid < end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid]<arr[mid-1]){
                return mid;
            }
            if (arr[start] >= arr[mid]) {

                end=mid-1;

            }
            else{
                start=mid+1;
            }

        }
        return -1;
    }

    public static int binarySearch(int arr[], int target, int start, int end){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
