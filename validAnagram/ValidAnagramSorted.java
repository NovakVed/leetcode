package validAnagram;

import java.util.Arrays;

/**
 * 242. Valid Anagram
 * {@link} <a href="https://leetcode.com/problems/valid-anagram/description/">...</a>
 */
class ValidAnagramSorted {
    public static void main(String[] args) {
        String s = "ca", t = "ac";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);
    }
}
