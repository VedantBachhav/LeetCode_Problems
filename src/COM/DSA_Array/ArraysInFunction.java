package COM.DSA_Array;

import java.util.*;

public class ArraysInFunction {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        // Array passing in functions.

        int [] nums = {1,23,4,5,6};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println("After changing the value using function.\n"+Arrays.toString(nums));
    }

    static void change(int[] arr) {
        arr[0] = 99;
    }
}
