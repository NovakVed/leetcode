package neetCode.binarySearch.findMinimumInRotatedSortedArray;

class FindMinimumInRotatedSortedArrayClean {
    public void main(String[] args) {
        int[] nums = new int[] { 3, 1, 2 };
        System.out.println(findMin(nums));
    }

    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < nums[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return nums[left];
    }
}
