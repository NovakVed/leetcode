package practice;

import java.util.Arrays;

public class ProductOfArrayExceptSelf1 {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 3, 4 };
        int[] answer = productExceptSelf(nums);
        Arrays.stream(answer).forEach(System.out::println);
    }

    private static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int pref = 1, post = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = pref;
            pref *= nums[i];
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= post;
            post *= nums[i];
        }

        return result;
    }
}
