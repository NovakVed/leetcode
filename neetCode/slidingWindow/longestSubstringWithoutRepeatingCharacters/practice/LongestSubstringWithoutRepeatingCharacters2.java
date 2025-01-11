package neetCode.slidingWindow.longestSubstringWithoutRepeatingCharacters.practice;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters2 {
    public static void main(String[] args) {
        String s = " ";
        System.out.println(lengthOfLongestSubstring(s));
    }

    private static int lengthOfLongestSubstring(String s) {
        int l = 0;
        int longestSubstring = 0;
        Set<Character> visited = new HashSet<>();

        for (int r = 0; r < s.length(); r++) {
            while (visited.contains(s.charAt(r))) {
                visited.remove(s.charAt(l++));
            }
            visited.add(s.charAt(r));
            longestSubstring = Math.max(r - l + 1, longestSubstring);
        }

        return longestSubstring;
    }
}
