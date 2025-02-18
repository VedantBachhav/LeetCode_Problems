package COM.Vedant_LeetCode;

//problem link : https://leetcode.com/problems/find-if-digit-game-can-be-won/description/

//solution link : https://leetcode.com/problems/find-if-digit-game-can-be-won/solutions/6437814/easy-java-solution-1ms-run-time-by-vedan-ry9y/

public class Problem3232DigitGame {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,10};
        System.out.println(canAliceWin(arr));
    }
    public static boolean canAliceWin(int[] nums) {
        int sumAlice = 0;
        int sumBob=0;
        for(int i =0; i<nums.length; i++){
            if(nums[i]<10 ){
                sumAlice+=nums[i];
            }
            else{
                sumBob+=nums[i];
            }
        }
        if(sumAlice==sumBob){
            return false;
        }
        return true;
    }

//    optimized for memory

//    public static boolean canAliceWin(int[] nums) {
//         int sumSingle = 0, sumDouble = 0;

//         for (int num : nums) {
//             if (num < 10) sumSingle += num;
//             else sumDouble += num;
//         }

//         return sumSingle > sumDouble || sumDouble > sumSingle;
//     }
// }

    }


