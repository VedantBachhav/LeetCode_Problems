class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if (k > nums.length || k <= 0) return 0;

        long sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double maxAvg = (double) sum / k;

        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            double avg = (double) sum / k;
            maxAvg = Math.max(maxAvg, avg);
        }

        return maxAvg;
    }
}
