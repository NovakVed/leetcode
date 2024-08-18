package neetCode.stack.dailyTemperatures;

import java.util.Arrays;
import java.util.Stack;

/**
 * 739. Daily Temperatures
 * {@link} <a href=
 * "https://leetcode.com/problems/daily-temperatures/description/">739. Daily
 * Temperatures</a>
 */
class DailyTemperatures {
    public void main(String[] args) {
        int[] temperatures = new int[] { 73, 74, 75, 71, 69, 72, 76, 73 };
        Arrays.stream(dailyTemperatures(temperatures)).forEach(System.out::println);
    }

    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> stack = new Stack<>();
        int[] result = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            int j = i;
            while (!stack.isEmpty() && stack.peek()[0] < temperatures[j]) {
                result[stack.peek()[1]] = j - stack.pop()[1];
            }
            stack.push(new int[] { temperatures[i], i });
        }
        return result;
    }
}
