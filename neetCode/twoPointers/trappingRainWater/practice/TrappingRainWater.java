package neetCode.twoPointers.trappingRainWater.practice;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] height = new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(trap(height));
    }

    private static int trap(int[] height) {
        int l = 0, r = height.length - 1;
        int leftMax = height[l], rightMax = height[r];
        int trappedWater = 0;
        while (l < r) {
            if (leftMax < rightMax) {
                l++;
                leftMax = Math.max(leftMax, height[l]);
                trappedWater += leftMax - height[l];
            } else {
                r--;
                rightMax = Math.max(rightMax, height[r]);
                trappedWater += rightMax - height[r];
            }
        }

        return trappedWater;
    }
}
