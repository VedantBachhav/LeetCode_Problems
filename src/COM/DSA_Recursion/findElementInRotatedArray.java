package COM.DSA_Recursion;

public class findElementInRotatedArray {
    public static void main(String[] args) {
     int[] arr = {4,5,6,7,0,1,2};

        System.out.println(findElement(arr,1,0,arr.length-1));


    }
    static int findElement(int [] arr, int target, int start, int end){
        if(start>end){
            return -1;
        }
        int mid = start+(end-start)/2;

        if(arr[mid]==target){
            return mid;
        }

        if(arr[start]<=arr[mid]){
            if(target>=arr[start] && target<=arr[mid]){
                return findElement(arr,target,start,mid-1);
            }
            else{
                return findElement(arr,target,mid+1, end);
            }


        }

        if (arr[start] >= arr[mid]) {  // ← keep this if left is descending sorted
            if (target <= arr[start] && target > arr[mid]) {
                return findElement(arr, target, start, mid - 1);  // ← FIXED: changed 0 to `start`
            } else {
                return findElement(arr, target, mid + 1, end);
            }
        }

        else{
            if( target >= arr[mid] && target<=arr[end] ){
                return findElement(arr,target,mid+1, end);
            }
            else{
                return findElement(arr,target,start,mid-1);
            }
        }
    }


}
