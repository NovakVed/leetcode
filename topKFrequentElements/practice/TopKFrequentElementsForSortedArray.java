package topKFrequentElements.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// works only if given array of elements is already sorted
class TopKFrequentElementsForSortedArray {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 1, 1, 2, 2, 3 };
        int k = 2;
        int[] result = topKFrequent(nums, k);
        Arrays.stream(result).forEach(System.out::println);
    }

    private static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, List<Integer>> buckets = new HashMap<>();
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                counter++;
            } else if (nums[i] != nums[i - 1]) {
                buckets.putIfAbsent(counter, new ArrayList<>());
                buckets.get(counter).add(nums[i - 1]);
                counter = 1;
            } else {
                counter++;
            }

            if (i == nums.length - 1) {
                buckets.putIfAbsent(counter, new ArrayList<>());
                buckets.get(counter).add(nums[i]);
            }
        }

        int[] result = new int[k];
        int index = 0;
        for (int i = nums.length; i > 0; i--) {
            if (k == index) {
                return result;
            }

            if (buckets.get(i) != null) {
                for (int j = 0; j < buckets.get(i).size(); j++) {
                    result[index++] = buckets.get(i).get(j);
                }
            }
        }

        return result;
    }
}
