package COM.Vedant_LeetCode;


//Problem Link : https://leetcode.com/problems/find-the-duplicate-number/description/

//Solution Link with explanation : https://leetcode.com/problems/find-the-duplicate-number/solutions/6115985/solved-using-cyclic-sort-using-java/


public class Problem287DuplicateUSingCyclic {
    public static void main(String[] args) {
        int [] arr = {1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }
        public static int findDuplicate(int[] nums) {
            for (int index = 0; index < nums.length;) {
                if (nums[index] != index + 1) {
                    int correct = nums[index] - 1;
                    if (nums[index] != nums[correct]) {
                        int swap = nums[correct];
                        nums[correct] = nums[index];
                        nums[index] = swap;
                    } else {
                        return nums[index];

                    }
                } else {
                    index++;
                }
            }
            return -1;
        }
    }