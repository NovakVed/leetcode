package neetCode.slidingWindow.longestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;
import java.util.Set;

/**
 * 3. Longest Substring Without Repeating Characters
 * {@link} <a href=
 * "https://leetcode.com/problems/longest-substring-without-repeating-characters/">3.
 * Longest Substring Without Repeating Characters</a>
 */
class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "zxyzxyz";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int l = 0;
        int ans = 0;

        Set<Character> visited = new HashSet<>();
        for (int r = 0; r < s.length(); r++) {
            while (visited.contains(s.charAt(r))) {
                visited.remove(s.charAt(l++));
            }
            visited.add(s.charAt(r));
            ans = Math.max(ans, r - l + 1);
        }

        return ans;
    }
}
