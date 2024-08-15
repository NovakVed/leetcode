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
        for (int num : nums) {
            if (!covered.add(num)) {
                return true;
            }
        }
        return false;
    }
}
