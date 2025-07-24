package COM.DSA_Searching;

import java.util.Arrays;

//Search in 2D arrays and matrix using Binary Search.
public class BinarySearchIn2DArrays {
    public static void main(String[] args) {
        int  [][] matrix={
//          col: 0 1 2 3 4
                {1,2,3,4,9},     // row 0
                {10,15,18,22},   // row 1
                {11,25,28,33},   // row 2
                {22,29,32,45}    // row 3
        };
        System.out.println(Arrays.toString(findTarget(matrix,28)));
        // target is 28 then answer is {row 2,col 2}
    }

    public static int[] findTarget(int [][] matrix, int target){
        int row =0;
        int col = matrix.length-1;
        while(row<matrix.length && col>=0){

            if(target==matrix[row][col]){
                return new int[]{row,col};
            }
            if(target>matrix[row][col]){
                row++;
            }
            else{
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
