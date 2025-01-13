package neetCode.slidingWindow.longestSubstringWithoutRepeatingCharacters.practice;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters3 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    private static int lengthOfLongestSubstring(String s) {
        int l = 0, r = 0, result = 0;
        Set<Character> visited = new HashSet<>();
        while (r < s.length()) {
            if (visited.add(s.charAt(r))) {
                r++;
                result = Math.max(r - l, result);
            } else
                visited.remove(s.charAt(l++));
        }
        return result;
    }
}
