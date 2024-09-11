package COM.DSA_Searching;

public class SearchInRange {
    public static void main(String[] args) {
        int [] arr={1,23,45,33,455,6,-43,8};
        int target = -43;
        System.out.println(LinearSearch(arr, target,2 ,5));
    }

    static int LinearSearch(int [] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = start; index <= end; index++) {
            //check for element at every index if it is = target;

            int element = arr[index];
            if (element == target) {
                return index;
            }

        }
        return -1;
    }

}

