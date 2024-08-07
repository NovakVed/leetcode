package topKFrequentElements;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 347. TopKFrequentElements
 *
 * @link <a href=
 *       "https://leetcode.com/problems/top-k-frequent-elements/description/">347.
 *       TopKFrequentElements</a>
 */
public class TopKFrequentElements {

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 2, 2, 3 };
        int k = 2;

        Arrays.stream(topKFrequent(nums, k)).forEach(System.out::println);
    }

    public static int[] topKFrequent(int[] nums, int k) {
        Set<Integer> visited = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();

        return new int[] {};
    }
}