class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
       int maxArea = 0, maxDig = 0;
       for(int [] rect : dimensions){
        int height = rect[0];
        int width = rect[1];

        int area = width * height;
        int dig = height * height + width * width;
        if(maxDig < dig ){
            maxArea = area;
            maxDig = dig;
        }
        else if( area>maxArea && dig == maxDig){
            maxArea = area;
        }

       }
        return maxArea;
    }
}