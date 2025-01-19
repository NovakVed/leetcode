package neetCode.slidingWindow.longestSubstringWithoutRepeatingCharacters.practice;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters4 {
    public static void main(String[] args) {
        String s = "abcbcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    private static int lengthOfLongestSubstring(String s) {
        int l = 0, r = 0, result = 0;
        Set<Character> visited = new HashSet<>();
        while (r < s.length()) {
            if (!visited.add(s.charAt(r))) {
                visited.remove(s.charAt(l++));
                continue;
            }

            r++;
            result = Math.max(result, r - l);
        }
        return result;
    }
}
