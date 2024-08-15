package practice;

import java.util.HashSet;
import java.util.Set;

/**
 * 217. Contains Duplicate
 * {@link} <a href="https://leetcode.com/problems/contains-duplicate/description/">217. Contains Duplicate</a>
 */
class ContainsDuplicate1 {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 1 };
        System.out.println(containsDuplicate(arr));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> covered = new HashSet<>();
        for (int num : nums) {
            if (!covered.add(num)) {
                return true;
            }
        }
        return false;
    }
}
