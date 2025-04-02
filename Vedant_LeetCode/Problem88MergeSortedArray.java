package COM.Vedant_LeetCode;
import java.util.*;
// Problem link : https://leetcode.com/problems/merge-sorted-array/description/

// solution link : https://leetcode.com/problems/merge-sorted-array/solutions/6606313/solve-using-java-provide-easy-solution-w-zvtm/
public class Problem88MergeSortedArray {
    public static void main(String[] args) {
        int [] nums1 = {1,2,3,0,0,0};
        int [] nums2 = {2,5,6};
        merge(nums1,3,nums2,3 );

    }

        public static void merge(int[] nums1, int m, int[] nums2, int n) {

            for (int i = m; i < m + n; i++) {
                nums1[i] = nums2[i - m];
            }

            // slightly better for memory. because avoid extra calculation at every iteration

            // for (int j = 0, i = m; j < n; j++) {
            //     nums1[i] = nums2[j];
            //     i++;
            // }

            // without using any build in method - run time 2ms - beats 8 %

            // for (int tern = 0; tern < nums1.length - 1; tern++) {
            //     for (int j = 0; j < nums1.length - 1 - tern; j++) {
            //         if (nums1[j] > nums1[j+1]) {
            //             int swap = nums1[j];
            //             nums1[j] = nums1[j+1];
            //             nums1[j+1] = swap;
            //         }
            //     }
            // }
            // System.out.println(Arrays.toString(nums1));

            // with using build in method  -- run time 1 ms beats 30 %
            Arrays.sort(nums1);
            System.out.println(Arrays.toString(nums1));
        }
    }

