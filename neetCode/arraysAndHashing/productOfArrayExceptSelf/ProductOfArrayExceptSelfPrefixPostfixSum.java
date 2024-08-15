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
        int[] prefixes = new int[nums.length];
        int[] postfixes = new int[nums.length];

        for (int i = 0; i < prefixes.length; i++) {
            if (i == 0)
                prefixes[i] = 1 * nums[i];
            else
                prefixes[i] = prefixes[i - 1] * nums[i];
        }

        for (int i = postfixes.length - 1; i >= 0; i--) {
            if (i == postfixes.length - 1)
                postfixes[i] = 1 * nums[i];
            else
                postfixes[i] = postfixes[i + 1] * nums[i];
        }

        int[] result = new int[nums.length];
        for (int i = 0; i < result.length; i++) {
            int prefix = 1;
            int postfix = 1;
            if (i != 0)
                prefix = prefixes[i - 1];
            if (i != result.length - 1)
                postfix = postfixes[i + 1];
            result[i] = prefix * postfix;
        }

        return result;
    }
}
