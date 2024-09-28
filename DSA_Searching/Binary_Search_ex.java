package COM.DSA_Searching;

public class Binary_Search_ex {
        public static void main(String[] args) {

                int [] arr= {-10,-1,0,4,9,52,100};
                int target = 4;
                System.out.println(BinarySearch(arr,target));
            }
            static int BinarySearch(int [] arr, int target){
                int start = 0;
                int end = arr.length-1;
                while(start<=end){

                    int mid= start+(end-start)/2;
                    if(target==arr[mid]){
                        return mid;
                    } else if (target>arr[mid]) {
                        start= mid+1;
                    }
                    else{
                        end = mid-1;
                    }
                }
                return -1;
            }
        }


