package COM.DSA_Searching;

public class FloorUsingBs {
    public static void main(String[] args) {
        int [] arr ={1,4,7,12,34,67,87};
        int target = 88;// output will be 4.
        System.out.println(FloorNumber(arr,target));
    }
    // Floor Number means Gretest number < = target.
    public static int FloorNumber(int [] arr, int target){
        int start =0, end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;

            // but what if the target element is smaller than smallest number in the array.-- see if statement

            if(arr[0]>target){
                return  -1;
            }

            else if(arr[mid]==target){
                return arr[mid];
            }
            else if (arr[mid]>target){
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }
        return arr[end];
    }

}
