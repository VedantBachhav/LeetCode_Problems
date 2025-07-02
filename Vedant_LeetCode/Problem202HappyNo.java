package COM.Vedant_LeetCode;

// Problem Link : https://leetcode.com/problems/happy-number/description/

// Solution Link : https://leetcode.com/problems/happy-number/solutions/6912557/solved-using-java-two-pointer-beats-100-9sz2s/

// solved this problem like linked list cycle present or not problem.

public class Problem202HappyNo {
    public static void main(String[] args) {
        System.out.println(happyNo(4));
    }

    public  static boolean happyNo(int n){
        int slow = n; // first pointer
        int fast = n; // second pointer

        do{
            slow = findSqr(slow); // move ahead one step.
            fast = findSqr(findSqr(fast)); // move ahead two steps.
        }while(slow!=fast);
        if(slow==1){
            return true;
        }
        return false;
    }

    public  static  int findSqr(int no){
        int ans = 0;
        while(no>0){
            int rem = no % 10;
            ans += rem * rem;
            no = no/10;
        }
        return ans;
    }
}

