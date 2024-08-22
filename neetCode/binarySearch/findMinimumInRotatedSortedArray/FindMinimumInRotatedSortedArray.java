package neetCode.binarySearch.findMinimumInRotatedSortedArray;

/**
 * 153. Find Minimum in Rotated Sorted Array
 * {@link} <a href=
 * "https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/">153.
 * Find Minimum in Rotated Sorted Array</a>
 */
class FindMinimumInRotatedSortedArray {
    public void main(String[] args) {
        int[] nums = new int[] { 3, 1, 2 };
        System.out.println(findMin(nums));
    }

    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            if (nums[l] <= nums[r])
                return nums[l];

            int m = l + (r - l) / 2;
            if (nums[l] <= nums[m])
                l = m + 1;
            else
                r = m;
        }
        return 0;
    }
}
