package trappingRainWater;

// TODO: work in progress
class TrappingRainWater {
    public static void main(String[] args) {
        int[] height = new int[] { 4, 2, 3 };
        System.out.println(trap(height));
    }

    public static int trap(int[] height) {
        int trappedRain = 0;
        int l = 0, r = l + 1;
        while (l < height.length) {
            if (height[l] > 0) {
                r = l + 1;
                int currentTrappedRain = trappedRain;
                while (r < height.length && height[l] > height[r]) {
                    currentTrappedRain -= height[r];
                    r++;
                }
                if (r != height.length) {
                    currentTrappedRain += Math.min(height[l], height[r]) * (r - l - 1);
                    trappedRain = currentTrappedRain;
                    l = r;
                } else {
                    l++;
                }
            } else {
                l++;
            }

        }
        return trappedRain;
    }
}
