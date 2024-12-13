package COM.Vedant_LeetCode;

import java.util.ArrayList;

import java.util.List;

//Problem Link : https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

// solved with optimized solution

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/submissions/1470497438/
public class problem448MissingNumbers {

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(missingNumber(arr));
    }

        public  static List<Integer> missingNumber(int [] Nums) {

            // sort the array using cyclic sort.
            for(int i =0 ;i<Nums.length;){
                int index = Nums[i]-1;
                if(  Nums[index]!=Nums[i] ){
                    int swap = Nums[index];
                    Nums[index]= Nums[i];
                    Nums[i]=swap;
                }
                else{
                    i++;
                }
            }

            // compare with elements.
            List<Integer> ans = new ArrayList<>();
            for(int Index = 0 ; Index<Nums.length; Index++){
                if(Nums[Index]!=Index+1){
                    ans.add(Index+1);
                }
            }

            return ans;


    }
}




