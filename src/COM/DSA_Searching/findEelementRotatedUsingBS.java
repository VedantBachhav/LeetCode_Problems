package COM.DSA_Searching;

public class findEelementRotatedUsingBS {
    public static void main(String[] args) {
        int [] arr = {7,8,9,10,1,2,3,4,5};
        System.out.println(searchElement(arr,5));

    }

    // Approach no 1 with using a multiple if else conditions
    // we also solved using the pivot function find the peak element int the array then solved using binary search algorith.
    public static int searchElement(int [] arr, int target){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]>=arr[start]){
                if(target>=arr[start] && arr[mid]>target ){
                    end= mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else {
                if(target>arr[mid] && target<=arr[end]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }

        }
        return -1;
    }

}
