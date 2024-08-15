package neetCode.twoPointers.containerWithMostWater;

/**
 * 11. Container With Most Water
 * 
 * @link <a
 *       href=
 *       "https://leetcode.com/problems/container-with-most-water/description/">11.
 *       Container With Most Water</a>
 */
class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int maxContainer = 0;
        int l = 0, r = height.length - 1;
        while (l < r) {
            int currentContainer = Math.min(height[l], height[r]) * (r - l);
            if (maxContainer < currentContainer) {
                maxContainer = currentContainer;
            }
            if (height[l] < height[r]) {
                l++;
            } else
                r--;
        }
        return maxContainer;
    }
}
