import java.util.Arrays;

/**
 * 238. Product of Array Except Self
 *
 * @link <a href=
 *       "https://leetcode.com/problems/product-of-array-except-self/description/">238.
 *       Product of Array Except Self</a>
 */
class ProductOfArrayExceptSelfBruteForce {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 3, 4 };
        // int[] nums = new int[] { -1, 1, 0, -3, 3 };
        int[] answer = productExceptSelf(nums);
        Arrays.stream(answer).forEach(System.out::println);
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        int right = 1, left = 1;
        for (int i = 0; i < nums.length; i++) {
            arr[i] = left;
            left *= nums[i];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            arr[i] *= right;
            right *= nums[i];
        }
        return arr;
    }
}
