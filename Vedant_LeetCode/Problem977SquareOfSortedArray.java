package COM.Vedant_LeetCode;
import java.util.*;

//Problem Link :https://leetcode.com/problems/squares-of-a-sorted-array/?envType=problem-list-v2&envId=prshgx6i

//Solution Link all solutions are attached in java file with three different approach
//https://leetcode.com/problems/squares-of-a-sorted-array/solutions/6437738/beats-100-java-solution-with-brute-force-t0c4/
public class Problem977SquareOfSortedArray {
    public static void main(String[] args) {
        int [] arr = {-7,-3,2,3,11};

        System.out.println(Arrays.toString(sortedSquares(arr)));
        System.out.println(Arrays.toString(sortedSquares1(arr)));
    }
    public static int[] sortedSquares(int[] nums) {
         int numLength= nums.length;
         int [] arr = new int [numLength];


//         Brute force 1:  approch with O(N^2)


         for(int index =0; index<numLength; index++){
            arr[index]=nums[index]*nums[index];
         }
        //    for (int tern = 0; tern < arr.length - 1; tern++) {
        //         for (int j = 0; j < arr.length - 1 - tern; j++) {
        //             if (arr[j] > arr[j+1]) {
        //                 int swap = arr[j];
        //                 arr[j] = arr[j+1];
        //                 arr[j+1] = swap;

        //             }
        //         }
        //     }


//       Brute force 2 : approch used sort method so beats only 13 ms O(nlogn)
     Arrays.sort(arr);





         return arr;
     }

    //         Approach 3 optimized approach using two pointer O(n)
    public static int[] sortedSquares1(int[] arr ) {
        int [] res= new int [arr.length];
        int start =0;
        int end =arr.length-1;

        for(int i=arr.length-1;i>=0;i--){
            if(Math.abs(arr[start])>Math.abs(arr[end])){
                res[i]=arr[start]*arr[start];
                start++;
            }

            else{
               res[i]= arr[end]*arr[end];
               end--;
            }
            }
        return res;
        }

    }

