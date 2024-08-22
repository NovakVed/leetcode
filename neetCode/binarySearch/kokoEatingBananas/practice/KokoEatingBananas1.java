package neetCode.binarySearch.kokoEatingBananas.practice;

import java.util.Arrays;

class KokoEatingBananas1 {
    public void main(String[] args) {
        int[] piles = new int[] { 3, 6, 7, 11 };
        int h = 8;
        System.out.println(minEatingSpeed(piles, h));
    }

    public int minEatingSpeed(int[] piles, int h) {
        int l = 1, r = Arrays.stream(piles).max().getAsInt();
        int k, totalTime, res = 0;
        while (l <= r) {
            k = l + (r - l) / 2;
            totalTime = 0;
            for (int p : piles) {
                totalTime += Math.ceil((double) p / k);
            }

            if (totalTime <= h) {
                res = k;
                r = k - 1;
            } else
                l = k + 1;
        }

        return res;
    }
}
