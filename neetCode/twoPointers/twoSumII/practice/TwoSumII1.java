package neetCode.twoPointers.twoSumII.practice;

import java.util.Arrays;

public class TwoSumII1 {
    public static void main(String[] args) {
        int[] numbers = new int[] { 2, 7, 11, 15 };
        Arrays.stream(twoSum(numbers, 9)).forEach(System.out::println);
    }

    private static int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            if (numbers[i] + numbers[j] == target)
                return new int[] { i + 1, j + 1 };
            if (numbers[i] + numbers[j] > target)
                j--;
            if (numbers[i] + numbers[j] < target)
                i++;
        }
        return new int[] {};
    }
}
