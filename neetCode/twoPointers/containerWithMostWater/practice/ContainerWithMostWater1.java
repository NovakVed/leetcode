package neetCode.twoPointers.containerWithMostWater.practice;

public class ContainerWithMostWater1 {
    public static void main(String[] args) {
        int[] height = new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(maxArea(height));
    }

    private static int maxArea(int[] heights) {
        int maxContainer = 0;
        int l = 0, r = heights.length - 1;
        while (l < r) {
            int currentContainer = Math.min(heights[l], heights[r]) * (r - l);
            if (currentContainer > maxContainer)
                maxContainer = currentContainer;
            if (heights[l] < heights[r])
                l++;
            else
                r--;
        }
        return maxContainer;
    }
}