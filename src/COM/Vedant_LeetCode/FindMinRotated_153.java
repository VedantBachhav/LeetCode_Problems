package COM.Vedant_LeetCode;
//problem link : https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/


// Find Minimum element in rotated array. Problem no 153.

//remove static from functions before used in leetcode
public class FindMinRotated_153 {
    public static void main(String[] args) {
    int [] arr= {2,3,4,5,6,0,1};
        System.out.println(findMin(arr));

    }
        public static int findMin(int[] arr) {
            int pivot = findPivot(arr);

            if(pivot==-1){
                return arr[0];

            }
            else{
                return arr[pivot+1];
            }
        }
        public static int findPivot(int [] arr){
            int start =0, end = arr.length-1;
            while(start<=end){
                int mid = start+(end-start)/2;
                if(end>mid && arr[mid]> arr[mid+1] ){
                    return mid;
                }
                if(start<mid && arr[mid]<arr[mid-1] ){
                    return mid-1;
                }
                if(arr[start]>=arr[mid]){
                    end = mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            return -1;
        }

    }

