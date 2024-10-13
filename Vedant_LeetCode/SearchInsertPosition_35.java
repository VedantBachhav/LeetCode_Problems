package COM.Vedant_LeetCode;
// Leetcode Problem Link : https://leetcode.com/problems/search-insert-position/description/
public class SearchInsertPosition_35 {

    public static void main(String[] args) {

        int [] arr= {1,2,4,5,6};
        int target = 3;// ans will be index no 2;

        System.out.println("Insert position in array of element "+target+ " is : "+searchInsert(arr,target));


    }

    // used approach like floor no. and return end + 1 that is our insert position .
    // We also used ceiling apporach and return start  that is our insert position.
        public static int searchInsert(int[] arr, int target) {
            int start = 0 ;
            int end = arr.length-1;
            while(start<=end){
                int mid = start+(end-start)/2;
                if(arr[mid]==target){
                    return mid;
                }
                else if(arr[mid]>target){
                    end=mid-1;
                }
                else{
                    start = mid+1;
                }

            }
//            return end+1;  // like floor
            return  start; // like ceiling
        }

}
