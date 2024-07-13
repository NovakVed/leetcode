import java.util.HashSet;
import java.util.Set;

class ContainsDuplicate1 {
    public void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 1 };
        System.out.println(containsDuplicate(arr));
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> covered = new HashSet<>();
        for (int num : nums) {
            if (!covered.add(num)) {
                return true;
            }
        }
        return false;
    }
}
