import java.util.Arrays;

/**
 * 1920. Build Array from Permutation
 * {@link} https://leetcode.com/problems/build-array-from-permutation/description/
 */
public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        int[] nums = { 0, 2, 1, 5, 3, 4 };
        Arrays.stream(buildArrayFromPermutation(nums)).forEach(System.out::println);
    }

    public static int[] buildArrayFromPermutation(int[] nums) {
        if (nums.length < 1) {
            return new int[0];
        }

        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[nums[i]];
        }
        return arr;
    }
}

// O(1) for space complexity, O(n) time complexity -> {bit-shifting}
// https://leetcode.com/problems/build-array-from-permutation/solutions/1315480/java-o-1-space-o-n-time/