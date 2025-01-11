package neetCode.twoPointers.trappingRainWater.practice;

public class TrappingRainWater1 {
    public static void main(String[] args) {
        int[] height = new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(trap(height));
    }

    private static int trap(int[] height) {
        int l = 0, r = height.length - 1;
        int maxLeft = height[0], maxRight = height[r];
        int trappedWater = 0;
        while (l < r) {
            if (maxLeft < maxRight) {
                l++;
                maxLeft = Math.max(maxLeft, height[l]);
                trappedWater += maxLeft - height[l];
            } else {
                r--;
                maxRight = Math.max(maxRight, height[r]);
                trappedWater += maxRight - height[r];
            }
        }
        return trappedWater;
    }
}
