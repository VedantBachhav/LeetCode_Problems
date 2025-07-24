package COM.Vedant_LeetCode;

//Problem link : https://leetcode.com/problems/three-consecutive-odds/description/

// Solution link : https://leetcode.com/problems/three-consecutive-odds/solutions/6434949/optimal-java-solution-beats-100-on-time-6tbw7/
public class Problem1550ConsecutiveOdds {
    public static void main(String[] args) {
        int [] arr = {5,7,1};
        System.out.println(threeConsecutiveOdds(arr));
    }

    public static boolean threeConsecutiveOdds(int[] arr) {
        int count =0;
        for(int i = 0; i<arr.length;i++){

             if(arr[i]%2!=0){
                count++;
                System.out.println(count);
                 if(count==3){
                     return true;
                 }
            }

            else{
                count=0;
            }
        }
        return false;
    }
}
