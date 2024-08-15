package neetCode.arraysAndHashing.twoSum.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class TwoSum2 {
    public static void main(String[] args) {
        int[] nums = new int[] { 2, 7, 11, 15 };
        int target = 9;
        int[] indices = twoSum(nums, target);

        Arrays.stream(indices).forEach(System.out::println);
    }

    // {
    // (9-2)->7: (position)->0
    // }

    private static int[] twoSum(int[] nums, int target) {
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
