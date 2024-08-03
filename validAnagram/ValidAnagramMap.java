package validAnagram;

import java.util.HashMap;
import java.util.Map;

/**
 * 242. Valid Anagram
 * {@link} <a href="https://leetcode.com/problems/valid-anagram/description/">242. Valid Anagram</a>
 */
public class ValidAnagramMap {
    public static void main(String[] args) {
        String s = "aacc", t = "ccac";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> occurrencesOfALetter = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (occurrencesOfALetter.containsKey(c)) {
                occurrencesOfALetter.put(c, occurrencesOfALetter.get(c) + 1);
            } else
                occurrencesOfALetter.put(c, 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (occurrencesOfALetter.containsKey(c) && occurrencesOfALetter.get(c) > 0) {
                occurrencesOfALetter.put(c, occurrencesOfALetter.get(c) - 1);
            } else
                return false;
        }
        return true;
    }
}
