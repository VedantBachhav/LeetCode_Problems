package COM.DSA_Array;


public class CountRotations {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,1};

        int pivot = findPivot(arr);


//        System.out.println("Rotations of array : " + (pivot+1));

        if(pivot==-1){
            System.out.println(arr[0]);

        }
//        if(arr[0]>arr[-1]){
//            System.out.println(arr[-1]);
//
//        }


        else{
            System.out.println(arr[pivot+1]);
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
            if(arr[start]<=arr[mid]){
                start=mid+1;
            }
        }
        return -1;
    }
}
