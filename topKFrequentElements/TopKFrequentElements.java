package topKFrequentElements;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * TopKFrequentElements
 * 
 * @link https://leetcode.com/problems/top-k-frequent-elements/description/
 */
public class TopKFrequentElements {

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 2, 2, 3 };
        int k = 2;

        Arrays.stream(topKFrequent(nums, k)).forEach(System.out::println);
    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        return null;
    }
}