package maximumAverageSubarray1;

public class MaximumAverageSubarray1 {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 12, -5, -6, 50, 3 };
        int k = 4;
        System.out.println(findMaxAverage(nums, k));
    }

    private static double findMaxAverage(int[] nums, int k) {
        int l = 0;
        double currentSum = 0;

        for (int r = 0; r < k; r++)
            currentSum += nums[r];

        double maxAverage = currentSum / k;

        for (int r = k; r < nums.length; r++) {
            currentSum += nums[r];
            currentSum -= nums[l++];
            maxAverage = Math.max(maxAverage, (currentSum / k));
        }

        return maxAverage;
    }
}
