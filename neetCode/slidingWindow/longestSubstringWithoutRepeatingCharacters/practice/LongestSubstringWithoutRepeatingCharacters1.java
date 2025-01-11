package neetCode.slidingWindow.longestSubstringWithoutRepeatingCharacters.practice;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters1 {
    public static void main(String[] args) {
        String s = " ";
        System.out.println(lengthOfLongestSubstring(s));
    }

    private static int lengthOfLongestSubstring(String s) {
        int l = 0, r = 0;
        int longestSubstring = 0;
        Set<Character> visited = new HashSet<>();

        while (r < s.length()) {
            if (visited.add(s.charAt(r))) {
                longestSubstring = Math.max(r - l + 1, longestSubstring);
                r++;
            } else {
                visited.remove(s.charAt(l));
                l++;
            }
        }
        return longestSubstring;
    }
}
