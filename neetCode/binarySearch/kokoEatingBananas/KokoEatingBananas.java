package neetCode.binarySearch.kokoEatingBananas;

import java.util.Arrays;

/**
 * 875. Koko Eating Bananas
 * {@link} <a href="https://leetcode.com/problems/koko-eating-bananas/">875.
 * Koko Eating Bananas</a>
 */
public class KokoEatingBananas {
    public void main(String[] args) {
        int[] piles = new int[] { 3, 6, 7, 11 };
        int h = 8;
        System.out.println(minEatingSpeed(piles, h));
    }

    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();
        int res = r;

        while (l <= r) {
            int k = l + (r - l) / 2;
            int totalTime = 0;
            for (int p : piles) {
                totalTime += Math.ceil((double) p / k);
            }

            if (totalTime <= h) {
                res = k;
                r = k - 1;
            } else {
                l = k + 1;
            }
        }

        return res;
    }
}
