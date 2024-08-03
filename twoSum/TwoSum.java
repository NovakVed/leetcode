package twoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. Two Sum
 * {@link} <a href="https://leetcode.com/problems/two-sum/description/">1. Two Sum</a>
 */
class TwoSum {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        System.out.print("[");
        for (int i : twoSum(nums, target)) {
            System.out.print(i);
            if (i == 0) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            } else {
                map.put(nums[i], i);
            }
        }

        return new int[] {};
    }
}