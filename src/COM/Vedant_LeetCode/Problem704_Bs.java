package COM.Vedant_LeetCode;

//solution link : https://leetcode.com/problems/binary-search/solutions/6150187/solve-using-java-beats-100-by-vedant_bac-0e5b/

//problem link :https://leetcode.com/problems/binary-search/description/
public class Problem704_Bs {
    public static void main(String[] args) {
        int [] arr= {-10,-1,0,4,9,52,100};
        int target = 4;
        System.out.println(BinartySearch(arr,target));
    }
    static int BinartySearch(int [] arr, int target){
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
