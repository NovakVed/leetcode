package neetCode.arraysAndHashing.topKFrequentElements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 347. TopKFrequentElements
 *
 * @link <a href=
 *       "https://leetcode.com/problems/top-k-frequent-elements/description/">347.TopKFrequentElements</a>
 */
public class TopKFrequentElements {

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 2, 2, 3 };
        int k = 2;

        Arrays.stream(topKFrequent(nums, k)).forEach(System.out::println);
    }

    public static int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] frequencies = new List[nums.length + 1];
        Map<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < frequencies.length; i++) {
            frequencies[i] = new ArrayList<>();
        }

        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            frequencies[entry.getValue()].add(entry.getKey());
        }

        int[] result = new int[k];
        int index = 0;
        for (int i = frequencies.length - 1; i > 0 && index < k; i--) {
            for (int num : frequencies[i]) {
                result[index++] = num;
                if (index == k) {
                    return result;
                }
            }
        }

        return result;
    }
}