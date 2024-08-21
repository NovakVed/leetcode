package neetCode.binarySearch.binarySearch;

/**
 * 704. Binary Search
 * {@link} <a href="https://leetcode.com/problems/binary-search/">704. Binary
 * Search</a>
 */
class BinarySearch {
    public void main(String[] args) {
        int[] nums = new int[] { 5 };
        int target = 5;
        System.out.println(search(nums, target));

    }

    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1, m = 0;
        while (l <= r) {
            m = l + (r - l) / 2;
            if (nums[m] == target) {
                return m;
            }

            if (nums[m] < target)
                l = m + 1;
            else
                r = m - 1;
        }

        return -1;
    }
}
