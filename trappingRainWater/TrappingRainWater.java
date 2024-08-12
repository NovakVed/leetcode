package trappingRainWater;

/**
 * 42. Trapping Rain Water
 * 
 * @link <a
 *       href=
 *       "https://leetcode.com/problems/trapping-rain-water/description/">42.
 *       Trapping Rain Water</a>
 *       Explanation: @link
 *       <a href="https://www.youtube.com/watch?v=ZI2z5pq0TqA">Video
 *       explanation</a>
 */
class TrappingRainWater {
    public static void main(String[] args) {
        int[] height = new int[] { 4, 2, 3 };
        System.out.println(trap(height));
    }

    public static int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }

        int l = 0, r = height.length - 1;
        int leftMax = height[l], rightMax = height[r];
        int res = 0;
        while (l < r) {
            if (leftMax < rightMax) {
                l++;
                leftMax = Math.max(leftMax, height[l]);
                res += leftMax - height[l];
            } else {
                r--;
                rightMax = Math.max(rightMax, height[r]);
                res += rightMax - height[r];
            }
        }
        return res;
    }
}
