package COM.DSA_Array;
import  java.util.*;
public class MultiDimensionArray {
    public static void main(String[] args) {

//        System.out.println("Printing two Dimension Array.");
        /*
        It looks like matrix.
        1 2 3
        4 5 6
        7 8 9
        Syntax : int [] [] arr = new int[rows*] [col]; rows are mandatory.
         */
//        // Method 1
//        int [] [] arr = new int[3][];
//        // Method 2 direct method.
//        int [] [] arrd={
//                {1,2,3},  // 0th index
//                {4,5,6},  //1st index
//                {7,8,9}   // 2nd index
//        };

        Scanner sc = new Scanner(System.in);

        // For input of the multi-dimension array.
        System.out.println("Enter array elements : ");

        int [] [] arr = new int [3][3];
        for (int row = 0; row< arr.length; row++){
            for (int col =0; col < arr[row].length;col++){
                arr[row][col] = sc.nextInt();
            }
        }

        // For output of the multi-dimension array using for loop.

        for (int row = 0; row< arr.length; row++){
            for (int col =0; col < arr[row].length;col++){
                System.out.print(arr[row] [col] + " ");
            }
            System.out.println();
        }

//        // For output using toString Method
//        for (int row =0 ; row< arr.length; row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }

        // Another method for to print array

        for (int [] a : arr){
            System.out.println(Arrays.toString(a));
        }
        


    }
}
