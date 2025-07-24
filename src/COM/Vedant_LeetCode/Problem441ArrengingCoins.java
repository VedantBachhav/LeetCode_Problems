package COM.Vedant_LeetCode;

//Problem Link : https://leetcode.com/problems/arranging-coins/description/

//Solution Link : https://leetcode.com/problems/arranging-coins/solutions/6130283/best-solution-using-java-with-3-different-approach/

public class Problem441ArrengingCoins {
    public static void main(String[] args) {
        int n = 3;
        System.out.println("Linear search approach : "+arrangeCoins(n));
        System.out.println("Binary search approach : " +arrangeCoinsBS(n));
        System.out.println("Iterative approach Best Sol : " +arrangeCoinsUisngIterator(n));
    }

    public static int arrangeCoins(int n) {
        int count = 0, min = n;
        for (int i = 1; i <= n; i++) {
            if (min >= 0 && i <= min) {
                min = min - i;
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public static int arrangeCoinsBS(int n) {
        int start = 0;
        int end = n;
        long count = 0;
        while(start<=end){
            int mid = start+(end-start)/2;
//            System.out.println(mid);
            count = mid*(mid+1)/2;
            if(count==n){
                return (int) mid;
            }
            if(n>count){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return (int) end;
    }

    public static int arrangeCoinsUisngIterator(int n) {
        int count = 0;
        while(count<n){
            count++;
            n=n-count;
        }
        return count;
    }
}
