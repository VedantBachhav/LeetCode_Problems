package COM.DSA_Recursion;

import java.util.Arrays;

public class SelectionSortUsingRecursion {
    public static void main(String[] args) {
        int [] arr = {4,3,2,1};
        System.out.println(Arrays.toString(selectionSort(arr,arr.length,0,0)));
    }
    public static int[] selectionSort(int [] arr, int pass, int innerPass, int max){
        if(pass==0){
            return arr;
        }
        if(pass>innerPass) {
            if (arr[innerPass] > arr[max]) {
                return selectionSort(arr, pass, innerPass + 1, innerPass);
            } else {
                return selectionSort(arr, pass, innerPass + 1, max);
            }
        }
            else{
                int temp = arr[pass-1];
                arr[pass-1]=arr[max];
                arr[max]=temp;
                return selectionSort(arr, pass-1,0,0);
            }
        }
    }

