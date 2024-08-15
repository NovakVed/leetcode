package neetCode.twoPointers.ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 15. 3Sum
 *
 * @link <a href=
 *       "https://leetcode.com/problems/3sum/description/">15. 3Sum</a>
 */
class ThreeSum {
    public static void main(String[] args) {
        int[] numbers = new int[] { -1, 0, 1, 2, -1, -4 };
        threeSum(numbers).forEach(System.out::println);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> triplets = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum > 0) {
                    r--;
                } else if (sum < 0) {
                    l++;
                } else {
                    triplets.add(List.of(nums[i], nums[l], nums[r]));
                    l++;
                    r--;

                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }
                }
            }
        }
        return triplets;
    }
}
