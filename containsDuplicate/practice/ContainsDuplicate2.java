package practice;

import java.util.Set;
import java.util.HashSet;

class ContainsDuplicate2 {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 3, 1 };
        System.out.println(containsDuplicate(nums));
    }

    private static boolean containsDuplicate(int[] nums) {
        Set<Integer> covered = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!covered.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}
