package twoSum.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 1. Two Sum
 * {@link} <a href="https://leetcode.com/problems/two-sum/description/">1. Two Sum</a>
 */
class TwoSum1 {
    public void main(String[] args) {
        int target = 9;
        int[] arr = new int[] { 2, 7, 11, 15 };

        Arrays.stream(twoSum(arr, target)).forEach(System.out::println);
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> sum = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (sum.containsKey(nums[i])) {
                return new int[] { sum.get(nums[i]), i };
            }
            sum.put(target - nums[i], i);
        }

        return new int[] {};
    }
}
