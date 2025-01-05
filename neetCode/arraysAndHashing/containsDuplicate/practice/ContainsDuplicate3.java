import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate3 {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 1 };
        System.out.println(containsDuplicate(arr)
                ? "Contains duplicates"
                : "Does not contain duplicates");
    }

    private static boolean containsDuplicate(int[] arr) {
        Set<Integer> covered = new HashSet<>();
        for (int i : arr)
            if (!covered.add(i))
                return true;

        return false;
    }
}