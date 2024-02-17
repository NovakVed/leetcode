import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

import java.util.HashMap;
import java.util.List;

/**
 * 49. Group Anagrams
 * {@link} https://leetcode.com/problems/group-anagrams/description/
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

    // public static List<List<String>> groupAnagrams(String[] strs) {
    // if (strs.length == 0) {
    // return List.of(List.of(EMPTY_STRING));
    // }
    // if (strs.length == 1) {
    // return List.of(List.of(strs[0]));
    // }

    // List<List<String>> result = new ArrayList<>();
    // if (isAnagram(strs[0], strs[1])) {
    // result.add(List.of(strs[0], strs[1]));
    // } else {
    // result.add(List.of(strs[0]));
    // result.add(List.of(strs[1]));
    // }

    // for (int i = 2; i < strs.length - 2; i++) {
    // boolean isAnagram = false;
    // for (int j = 0; j < strs.length; j++) {
    // if (!isAnagram) {
    // if (isAnagram(result.get(j).get(0), strs[i])) {
    // result.get(j).add(strs[i]);
    // isAnagram = true;
    // }
    // }
    // }
    // if (!isAnagram) {
    // result.add(List.of(strs[i]));
    // }
    // }

    // return result;
    // }

    // public static boolean isAnagram(String s, String t) {
    // if (s.length() != t.length())
    // return false;

    // int[] count = new int[26];

    // for (int i = 0; s.length() > i; i++) {
    // count[s.charAt(i) - 'a']++;
    // }

    // for (int i = 0; t.length() > i; i++) {
    // count[t.charAt(i) - 'a']--;
    // }

    // for (int val : count) {
    // if (val != 0) {
    // return false;
    // }
    // }

    // return true;
    // }
}
