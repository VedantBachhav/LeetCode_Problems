package COM.Vedant_LeetCode;

import java.util.Arrays;

public class Problem74_2d_search_element {


    public static void main(String[] args) {
        int [] [] arr ={
                {12,15,14,45},
                {18,65,89,0},
                {07,1,100,11}
        };

//        System.out.println(Arrays.toString(arr));
//        int ans = searchMatrix(arr,11);

        System.out.println(searchMatrix(arr,888));
    }
        public static boolean searchMatrix(int[][] matrix, int target) {

            for (int i = 0; i<matrix.length; i++){
                for(int j=0; j<matrix[i].length; j++){

                    if(matrix[i][j]==target){
                        return true;
                    }

                }

            }
            return false;
        }
    }

