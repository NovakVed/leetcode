import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams3 {
    public static void main(String[] args) {
        String[] strs = new String[] { "act", "pots", "tops", "cat", "stop", "hat" };
        groupAnagrams(strs).forEach(System.out::println);
    }

    private static List<List<String>> groupAnagrams(String[] strs) {
        Map<Integer, List<String>> ans = new HashMap<>();
        for (String s : strs) {
            int[] count = new int[26];
            for (int i = 0; i < s.length(); i++) {
                count[s.charAt(i) - 'a']++;
            }

            Integer key = Arrays.hashCode(count);
            System.out.println("KEY: " + key);
            if (!ans.containsKey(key)) {
                ans.put(key, new ArrayList<>());
            }
            ans.get(key).add(s);
        }
        return new ArrayList<>(ans.values());
    }
}
