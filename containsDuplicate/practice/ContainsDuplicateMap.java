package practice;

import java.util.Map;
import java.util.HashMap;

class ContainsDuplicateMap {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 3 };
        if (hasDuplicate(arr)) {
            System.out.println("Given array has duplicates!");
        } else {
            System.out.println("Dosen't have duplicates");
        }
    }

    public static boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> duplicates = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int count = duplicates.getOrDefault(nums[i], 0);
            if (count > 0)
                return true;
            duplicates.put(nums[i], count + 1);
        }

        return false;
    }
}
