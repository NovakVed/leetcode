package neetCode.stack.carFleet;

/**
 * 853. Car Fleet
 * {@link} <a href=
 * "https://leetcode.com/problems/car-fleet/description/">853. Car Fleet</a>
 */
class CarFleet {
    public void main(String[] args) {
        int target = 12;
        int[] position = new int[] { 10, 8, 0, 5, 3 }, speed = new int[] { 2, 4, 1, 1, 3 };
        int result = carFleet(target, position, speed);
        System.out.println(result);
    }

    public int carFleet(int target, int[] position, int[] speed) {
        final int n = position.length;
        final double[] time = new double[target];

        for (int i = 0; i < n; ++i)
            time[position[i]] = (double) (target - position[i]) / speed[i];

        double prev = 0.0;
        int res = 0;

        for (int i = target - 1; i >= 0; --i) {
            final double cur = time[i];

            if (cur > prev) {
                prev = cur;
                res++;
            }
        }

        return res;
    }
}
