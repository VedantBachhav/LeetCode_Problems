package COM.Vedant_LeetCode;
//Problem link : https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/description/
// Problem level  : Hard
//Note : remove static before used in leetcode.
public class MinInDuplicateRoatatedII_154 {
    public static void main(String[] args) {
        int [] arr={1};
//        int [] arr = {2,2,2,1,2,2};// ans is 1;

        System.out.println(findMin(arr));
    }

    public static int findMin(int arr[]){
        if(arr.length == 1){
            return arr[0];
        }
        else if(arr.length == 0){
            return -1;
        }
        else{
            int pivot = findMinDuplicateRotated(arr);
            return arr[pivot+1];
        }
    }
    public static int findMinDuplicateRotated(int [] arr){
        int start=0;
        int end= arr.length-1;
        while (start<=end){
            int mid= start+(end-start)/2;
            if(end>mid && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(start<mid && arr[mid-1]>arr[mid]){
                return mid-1;
            }
            if(arr[start]==arr[mid] && arr[mid]==arr[end]){
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;

                if(end>0 && arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            } else if (arr[start]<=arr[mid]  && arr[mid]>arr[end]) {
                start= mid+1;

            }else {
                end=mid-1;
            }
        }
        return -1;
    }
}
