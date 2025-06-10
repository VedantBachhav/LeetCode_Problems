package COM.DSA_Recursion;

public class ArrayIsSorted {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,0};
        System.out.println(isSorted(arr,0));
    }
    public static boolean isSorted(int [] arr, int index){
        if(index==arr.length-1){ // Base condition
            return true;
        }
        return arr[index]< arr[index+1] && isSorted(arr,index+1);
    }

}
