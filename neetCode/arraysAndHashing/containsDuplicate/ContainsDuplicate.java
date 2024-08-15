import java.util.Set;
import java.util.HashSet;

/**
 * 217. Contains Duplicate
 * {@link} https://leetcode.com/problems/contains-duplicate/description/
 */
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 1 };
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        final Set<Integer> duplicates = new HashSet<>();
        for (int i : nums) {
            if (!duplicates.add(i))
                return true;
        }
        return false;
    }
}
