package twoSumII;

import java.util.Arrays;

/**
 * 167. Two Sum II - Input Array Is Sorted
 *
 * @link <a
 *       href=https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/">167.
 *       Two Sum II - Input Array Is Sorted</a>
 */
class TwoSumII {
    public static void main(String[] args) {
        int[] numbers = new int[] { 2, 7, 11, 15 };
        int target = 9;
        Arrays.stream(twoSum(numbers, target)).forEach(System.out::println);
    }

    public static int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;
        while (l <= r) {
            int curSum = numbers[l] + numbers[r];

            if (curSum > target) {
                r--;
            } else if (curSum < target) {
                l++;
            } else {
                return new int[] { l + 1, r + 1 };
            }
        }

        return new int[0];
    }

}
