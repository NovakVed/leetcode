package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GroupAnagrams2 {
    public static void main(String[] args) {
        String[] strs = new String[] { "eat", "tea", "tan", "ate", "nat", "bat" };
        List<List<String>> groups = groupAnagrams(strs);
        System.out.println(groups);
    }

    // Input: strs = ["eat","tea","tan","ate","nat","bat"]
    // Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

    // ascii + sets
    // 89 -> nat, tan

    // O(n^2*k) n-> num of elements in array | k->each char in string

    private static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Set<String> anagrams = new HashSet<>();
        for (int i = 0; i < strs.length; i++) {
            if (anagrams.add(strs[i])) {
                List<String> currentWordAnagrams = new ArrayList<>();
                currentWordAnagrams.add(strs[i]);
                for (int j = i + 1; j < strs.length; j++) {
                    if (isAnagram(strs[i], strs[j])) {
                        currentWordAnagrams.add(strs[j]);
                        anagrams.add(strs[j]);
                    }
                }
                result.add(currentWordAnagrams);
            }
        }

        return result;
    }

    private static boolean isAnagram(String source, String target) {
        if (source.length() != target.length())
            return false;

        int[] count = new int[26];
        for (int i = 0; i < source.length(); i++) {
            count[source.charAt(i) - 'a']++;
            count[target.charAt(i) - 'a']--;
        }

        for (int i : count)
            if (i != 0)
                return false;
        return true;
    }
}
