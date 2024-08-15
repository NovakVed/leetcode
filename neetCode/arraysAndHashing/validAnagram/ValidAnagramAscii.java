package neetCode.arraysAndHashing.validAnagram;

/**
 * 242. Valid Anagram
 * {@link} <a href="https://leetcode.com/problems/valid-anagram/description/">242. Valid Anagram</a>
 */
public class ValidAnagramAscii {
    public void main(String[] args) {
        String s = "ac", t = "ca";
        System.out.println(isAnagram(s, t));
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int i : count) if (i != 0) return false;
        
        return true;
    }
}
