package neetCode.arraysAndHashing.topKFrequentElements.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements1 {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 1, 1, 2, 2, 3 };
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }

    private static int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] buckets = new List[nums.length + 1];
        Map<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < buckets.length; i++)
            buckets[i] = new ArrayList<>();

        for (int num : nums)
            count.put(num, count.getOrDefault(num, 0) + 1);

        for (Map.Entry<Integer, Integer> bucket : count.entrySet())
            buckets[bucket.getValue()].add(bucket.getKey());

        var result = new int[k];
        int index = 0;
        for (int i = buckets.length - 1; i > 0 && index < k; i--) {
            for (int bucket : buckets[i]) {
                result[index++] = bucket;
            }
        }

        return result;
    }
}
