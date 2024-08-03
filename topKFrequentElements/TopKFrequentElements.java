package topKFrequentElements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 347. TopKFrequentElements
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
        Set<Integer> visited = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (var i : nums) {
            if (visited.add(i)) {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
        }

        List<Integer> result = new ArrayList<>();
        for (var i : visited) {
            if (map.get(i) > k) {
                result.add(i);
            }
        }

        return new int[] {};
    }
}