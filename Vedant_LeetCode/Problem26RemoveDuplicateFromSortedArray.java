package COM.Vedant_LeetCode;

//Problem link : https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

//Solution Link : https://leetcode.com/problems/remove-duplicates-from-sorted-array/solutions/6610364/easy-java-solution-using-two-pointers-ap-6c2q/

public class Problem26RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int [] nums = {1,1,2,3,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;

        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                count++;
                nums[count - 1] = nums[i];
            }
        }

        return count;
    }
}

