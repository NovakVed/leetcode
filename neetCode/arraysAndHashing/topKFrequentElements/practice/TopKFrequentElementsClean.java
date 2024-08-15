package neetCode.arraysAndHashing.topKFrequentElements.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TopKFrequentElementsClean {

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 2, 2, 3 };
        int k = 2;

        Arrays.stream(topKFrequent(nums, k)).forEach(System.out::println);
    }

    public static int[] topKFrequent(int[] nums, int k) {
        List<List<Integer>> frequencies = new ArrayList<>();
        Map<Integer, Integer> countMap = new HashMap<>();

        // Initialize the frequency list with empty lists
        for (int i = 0; i <= nums.length; i++) {
            frequencies.add(new ArrayList<>());
        }

        // Count the frequency of each element
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Group numbers by their frequency
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int frequency = entry.getValue();
            int number = entry.getKey();
            frequencies.get(frequency).add(number);
        }

        // Collect the top k frequent elements
        List<Integer> topKFrequent = new ArrayList<>();
        for (int i = frequencies.size() - 1; i > 0 && topKFrequent.size() < k; i--) {
            topKFrequent.addAll(frequencies.get(i));
        }

        // Convert the list to an array and return the first k elements
        return topKFrequent.stream().limit(k).mapToInt(i -> i).toArray();
    }
}
