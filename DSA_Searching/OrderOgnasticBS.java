package COM.DSA_Searching;

public class OrderOgnasticBS {
    public static void main(String[] args) {

//        int [] arr = {1,2, 4, 8, 6, 15, 25, 35, 45, 55, 60};
        int [] arr = { 60, 55,40,20,10,5,1,0};
        int target = 60;
        int start =0, end = arr.length-1, ans=-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                ans = mid;
                break;
            }

            if (arr[start]<arr[end]){  // For ascending order array.

                if (arr[mid]<target){
                    start = mid + 1;
                }
                else{
                    end = mid-1;
                }
            }
            else{                       // For descending order array.
                if(arr[mid]<target){
                    end = mid-1;
                }
                else{
                    start = mid +1;
                }
            }
        }

        if(ans == -1){   // if element is not found.
            System.out.println("Elment "+ target +" is not found in array.");
        }
        else{           // if element is found.
            System.out.println("Element "+target+" is found in array at index number "+ ans);

        }



    }
}
