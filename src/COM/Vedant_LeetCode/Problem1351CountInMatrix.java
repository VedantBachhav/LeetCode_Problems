package COM.Vedant_LeetCode;

// Solution link : https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/solutions/6109410/solution-with-100-ms-using-binary-search/

// Problem link : https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/description/


public class  Problem1351CountInMatrix {
    public static void main(String[] args) {
        int [][] grid = { {4,3,2,-1},
                {3,2,1,-1},
                {1,1,-1,-2},
                {-1,-1,-2,-3}};
        System.out.println(countNegatives(grid));
    }
    public static int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int countNegatives = 0;
        int row = m-1;
        int col = 0;
        while(row>=0 && col<=n-1){
            if(grid[row][col]<0){
                countNegatives+=n-col;
                row--;
            }
            else{
                col++;
            }
        }
        return countNegatives;
    }
}
