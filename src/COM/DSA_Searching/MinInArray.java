package COM.DSA_Searching;

public class MinInArray {

    public static void main(String[] args) {
        int [] arr={1,23,45,33,455,6,-43,8};
        System.out.println(min(arr));
    }

    //Q find min no in array.
    static int min(int [] arr){

        int min_no = arr[0];
        for(int element : arr){
            if( min_no > element){
                min_no = element;
            }
        }
        return min_no;
    }
}
