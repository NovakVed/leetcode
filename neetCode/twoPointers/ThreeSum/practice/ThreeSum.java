package neetCode.twoPointers.ThreeSum.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = new int[] { -1, 0, 1, 2, -1, -4 };
        printResult(threeSum(nums));
    }

    private static void printResult(List<List<Integer>> nums) {
        for (List<Integer> sums : nums) {
            System.out.print("[");
            for (int num : sums) {
                System.out.printf("%d, ", num);
            }
            System.out.print("]");
        }
    }

    private static List<List<Integer>> threeSum(int[] nums) {
        quickSort(nums, 0, nums.length - 1); // O(n log n)
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                if (nums[i] + nums[l] + nums[r] == 0) {
                    result.add(Arrays.asList(nums[i], nums[l++], nums[r--]));
                    while (l < r && nums[l] == nums[l - 1]) l++;
                } 
                else if (nums[i] + nums[l] + nums[r] < 0) l++;
                else r--;
            }
        }
        return result;
    }

    private static void quickSort(int[] nums, int l, int r) {
        if (l > r)
            return;

        int pivot = partition(nums, l, r);
        quickSort(nums, l, pivot - 1);
        quickSort(nums, pivot + 1, r);
    }

    private static int partition(int[] nums, int l, int r) {
        int p = nums[r];
        int j = l - 1;
        for (int i = l; i < r - 1; i++) {
            if (nums[i] <= p)
                swap(nums, i, ++j);
        }
        swap(nums, ++j, r);
        return j;
    }

    private static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
