package COM.DSA_Array;
import java.util.*;
public class Array {
    public static void main(String[] args) {

        //Array is a collection of Data types.
        //All the tyep of data should be same in array.
        //Syntax : data_type[] Variable_name = new datatype[size];

        //Methods of define array:
//        1)
        int [] rons= new int[5];
//        2)
        int [] rons2 = {25,45,48,50,10};

        // int[] ros; // declaration of array. ros is getting defined in the stack.
//           ros= new int[5];// initialisation : actually here object is being created ,

        System.out.println(rons[2]); // print 0 because default of int is 0.

        String [] arr1 = new String[4];
        System.out.println(arr1[3]); // print null because default value of string is null.


//        array input

        int [] arr = new  int[5];
        arr[0] =20;
        arr[1]=21;
        arr[2]=22;
        arr[3]=23;
        arr[4]=24;

        System.out.println(arr[3]); // time consuming method for long data.
        //System.out.println(arr[5]);//index out of bound error.
        // input using for loop;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array elements size = 5 ");
        for(int i =0; i <arr.length; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array Elements are : ");
        for(int i =0; i <arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        // Print using for each loop. (and using indices

        System.out.println("\n\nPrint array using for each loop.");
        for (int num : arr){             // for every element in array, print the element.
            System.out.print(num +" "); // here num element of the array.
        }

        // print the above array using Arrays.toString() method
        System.out.println("\n\nPrint using Arrays.toString() method. for well formatting");
        System.out.println(Arrays.toString(arr));

        // Array of objects.
        System.out.println("\n\nEnter String elements for array of objects.");
        String [] str = new String[4];
        for (int i=0; i<str.length; i++){
            str[i]=sc.next();
    }
        System.out.println(Arrays.toString(str));

    }
}
