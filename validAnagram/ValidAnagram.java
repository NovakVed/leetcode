package validAnagram;

import java.util.HashMap;
import java.util.Map;

/**
 * 242. Valid Anagram
 * {@link} https://leetcode.com/problems/valid-anagram/description/
 */
public class ValidAnagram {
	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";

		System.out.println(isAnagram(s, t));
	}

	public static boolean isAnagram(final String s, final String t) {
		Map<Character, Integer> count = new HashMap<>();

		for (char c : s.toCharArray()) {
			count.put(c, count.getOrDefault(c, 0) + 1);
		}

		for (char c : t.toCharArray()) {
			count.put(c, count.getOrDefault(c, 0) - 1);
		}

		for (int val : count.values()) {
			if (val != 0) {
				return false;
			}
		}

		return true;
	}

}

// public static boolean isAnagram(final String s, final String t) {
// if (s.length() != t.length())
// return false;

// int[] count = new int[26];

// // Count the frequency of characters in string s
// for (char x : s.toCharArray()) {
// count[x - 'a']++;
// }

// // Decrement the frequency of characters in string t
// for (char x : t.toCharArray()) {
// count[x - 'a']--;
// }

// // Check if any character has non-zero frequency
// for (int val : count) {
// if (val != 0) {
// return false;
// }
// }

// return true;
// }
// }