package COM.Vedant_LeetCode;

//Problem Link : https://leetcode.com/problems/rearrange-array-elements-by-sign/description/

//Solution Link : https://leetcode.com/problems/rearrange-array-elements-by-sign/solutions/6601348/beats-100-easy-java-solution-with-two-ap-3b3z//


import java.util.Arrays;

public class Problem2149RearrengeArray {
    public static void main(String[] args) {
        int [] nums = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }
    public static int[] rearrangeArray(int[] nums) {

// Brute for approach time and space complexity = O(n)

//         ArrayList<Integer> pos = new ArrayList<>();
//         ArrayList<Integer> neg = new ArrayList<>();
//         int [] arr = new int[nums.length];
//         for(int i =0; i<nums.length; i++){
//             if(nums[i]<0){
//                 pos.add(nums[i]);
//             }
//             else{
//                 neg.add(nums[i]);
//             }
//         }
//         int a=0, b=0;
//     for(int j =0; j<arr.length; j++){
//         if(j%2==1){
//             arr[j]= pos.get(a);
//             a++;
//         }
//         else{
//             arr[j]=neg.get(b);
//             b++;
//         }
//     }
//     return arr;

//     }
// }


// Optimized approach - space complexity = O(1) && time compexity =O(n)

        int [] result = new int [nums.length];
        int negativeCount =1;
        int positiveCount =0;

        for(int num : nums){
            if(num > 0){
                result[positiveCount]= num;
                positiveCount +=2;
            }
            else{
                result[negativeCount]=num;
                negativeCount +=2;
            }

        }
        return result;
    }

}
