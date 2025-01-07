package neetCode.arraysAndHashing.longestConsecutiveSequence.practice;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence1 {
    public static void main(String[] args) {
        int[] nums = new int[] { 100, 4, 200, 1, 3, 2 };
        System.out.println(longestConsecutive(nums));
    }

    private static int longestConsecutive(int[] nums) {
        Set<Integer> sequence = new HashSet<>();
        for (int num : nums)
            sequence.add(num);

        int longestSequence = 0;
        for (int num : nums) {
            if (!sequence.contains(num - 1)) {
                int i = 1;
                while (sequence.contains(++num)) {
                    i++;
                }
                longestSequence = Math.max(i, longestSequence);
            }
        }

        return longestSequence;
    }
}
