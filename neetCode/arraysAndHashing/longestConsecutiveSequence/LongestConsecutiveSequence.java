package neetCode.arraysAndHashing.longestConsecutiveSequence;

import java.util.HashSet;
import java.util.Set;

/**
 * 128. Longest Consecutive Sequence
 * {@link} <a href=
 * "https://leetcode.com/problems/longest-consecutive-sequence/description/">128.
 * Longest Consecutive Sequence</a>
 */
class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = new int[] { 2, 20, 4, 10, 3, 4, 5 };
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longestSequence = 0;
        for (Integer num : numSet) {
            if (!numSet.contains(num - 1)) {
                int i = 1;
                while (numSet.contains(num + i)) {
                    i++;
                }
                longestSequence = Math.max(i, longestSequence);
            }
        }
        return longestSequence;
    }

}
