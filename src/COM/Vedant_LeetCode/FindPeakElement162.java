package COM.Vedant_LeetCode;
//link of the problem : https://leetcode.com/problems/find-peak-element/description/
//level : medium level problem.


public class FindPeakElement162 {
    public static void main(String[] args) {
        int [] arr = {1,2,1,3,5,6,4};
//        output will be :Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.

        System.out.println(findPeakElemnt(arr));
    }
    public static int findPeakElemnt(int [] arr){
        int start =0;
        int end = arr.length-1;

        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }
            else{
                start= mid+1;
            }
        }
        return start;
    }

}
