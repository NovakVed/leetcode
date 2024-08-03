import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 49. Group Anagrams
 * {@link} <a href=
 * "https://leetcode.com/problems/group-anagrams/description/">49. Group
 * Anagrams</a>
 */
class GroupAnagramsSorted {
    public static void main(String[] args) {
        String[] strs = new String[] { "eat", "tea", "tan", "ate", "nat", "bat" };
        List<List<String>> groups = groupAnagrams(strs);
        groups.forEach(System.out::println);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String string : strs) {
            char[] chars = string.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }

            map.get(sortedWord).add(string);
        }

        return new ArrayList<>(map.values());
    }
}
