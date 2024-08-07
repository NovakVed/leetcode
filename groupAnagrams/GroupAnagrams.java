import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

import java.util.HashMap;
import java.util.List;

/**
 * 49. Group Anagrams
 * {@link} <a href=
 * "https://leetcode.com/problems/group-anagrams/description/">49. Group
 * Anagrams</a>
 */
public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }

            map.get(sortedWord).add(word);
        }

        return new ArrayList<>(map.values());
    }
}
