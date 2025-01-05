package neetCode.arraysAndHashing.twoSum.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum3 {
    public static void main(String[] args) {
        int[] nums = new int[] { 2, 7, 11, 15 };
        int target = 9;
        int[] result = twoSum(nums, target);
        Arrays.stream(result).forEach(System.out::println);
    }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]))
                return new int[] { map.get(nums[i]), i };
            else
                map.put(target - nums[i], i);
        }
        return new int[] {};
    }
}
