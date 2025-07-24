package COM.Vedant_LeetCode;
//Problem Link :https://leetcode.com/problems/missing-number/description/

//Solution link : https://leetcode.com/problems/missing-number/solutions/6114111/provided-both-approaches-using-sorting-and-mathematical-approach-with-explanation-in-java-100-ms

// Note : used optimized solution for leetcode - beats 100 ms.
public class Problem268MissingNumber {
    public static void main(String[] args) {
        int [] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println("Solution by using cyclic sort and comparission " +missingNumber(arr));
        System.out.println("Optimized solution using logical appr. " +missingNumberOptimized(arr));

    }

//    solved using cyclic sort but its time complexity is O(N)
    public  static  int missingNumber(int [] arr) {

        // sort the array using cyclic sort.
        for(int i =0 ;i<arr.length;){
            int index = arr[i];
            if( arr[i] < arr.length && arr[index]!=arr[i] ){
                int swap = arr[index];
                arr[index]= arr[i];
                arr[i]=swap;
            }
            else{
                i++;
            }
        }

        // compare with elements.
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i]!=i){
                return i;
            }
        }

        return arr.length;
    }


    // Solved by using mathematical and logical approach;
    public  static  int missingNumberOptimized(int [] arr) {
        int total = arr.length*(arr.length+1)/2;
        int sum = 0;
        for(int count : arr){
            sum += count;
        }
        return total-sum;
    }
    }
