package twoSumII;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class TwoSumIIBad {
    public static void main(String[] args) {
        int[] numbers = new int[] { 2, 7, 11, 15 };
        int target = 9;
        Arrays.stream(twoSum(numbers, target)).forEach(System.out::println);
    }

    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> sum = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (sum.containsKey(numbers[i])) {
                return new int[] { sum.get(numbers[i]) + 1, i + 1 };
            }
            sum.put(target - numbers[i], i);
        }
        return new int[] {};
    }
}
