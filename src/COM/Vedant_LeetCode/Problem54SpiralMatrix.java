package COM.Vedant_LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem54SpiralMatrix {
    public static void main(String[] args) {
        int [][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        System.out.println(spiralOrder(matrix));
    }


        public static List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> list = new ArrayList<>();
            int top = 0, bottom = matrix.length - 1;
            int left = 0, right = matrix[0].length - 1;

            while (top <= bottom && left <= right) {
                // Traverse from left to right
                for (int j = left; j <= right; j++)
                    list.add(matrix[top][j]);
                top++;

                // Traverse from top to bottom
                for (int i = top; i <= bottom; i++)
                    list.add(matrix[i][right]);
                right--;

                // Traverse from right to left, if still in bounds
                if (top <= bottom) {
                    for (int j = right; j >= left; j--)
                        list.add(matrix[bottom][j]);
                    bottom--;
                }

                // Traverse from bottom to top, if still in bounds
                if (left <= right) {
                    for (int i = bottom; i >= top; i--)
                        list.add(matrix[i][left]);
                    left++;
                }
            }

            return list;
        }
    }


