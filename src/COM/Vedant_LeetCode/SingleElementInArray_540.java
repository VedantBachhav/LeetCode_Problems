// Problem link : https://leetcode.com/problems/single-element-in-a-sorted-array/

//Note : do it yourself. cFcg
package COM.Vedant_LeetCode;

public class SingleElementInArray_540 {

        public int singleNonDuplicate(int[] nums) {
            int start = 0, end = nums.length - 1;

            while (start < end) {
                int mid = start + (end - start) / 2;

                // Ensure mid is even so we can compare it with mid + 1

                if (mid % 2 == 1) {
                    mid--;
                }

                // Check if the pair is consistent
                if (nums[mid] == nums[mid + 1]) {
                    // If consistent, move to the right half
                    start = mid + 2;
                } else {
                    // If not consistent, move to the left half
                    end = mid;
                }
            }

            return nums[end];
        }

        public static void main(String[] args) {
            SingleElementInArray_540 solution = new SingleElementInArray_540();
            int[] nums = {1, 1, 3, 3, 4, 4, 8, 8,9};
            System.out.println("The single element is: " + solution.singleNonDuplicate(nums));
        }
    }
