package neetCode.slidingWindow.longestRepeatingCharacterReplacement;

/**
 * 424. Longest Repeating Character Replacement
 * {@link} <a href=
 * "https://leetcode.com/problems/longest-repeating-character-replacement/">424.
 * Longest Repeating Character Replacement</a>
 */
class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        System.out.println(characterReplacement(s, k));
    }

    public static int characterReplacement(String s, int k) {
        int[] count = new int[26];

        int l = 0;
        int max = 0;
        int ans = 0;

        for (int r = 0; r < s.length(); r++) {
            count[s.charAt(r) - 'A']++;
            max = Math.max(max, count[s.charAt(r) - 'A']);

            if (r - l + 1 - max > k) {
                count[s.charAt(l) - 'A']--;
                l++;
            }
            ans = Math.max(ans, r - l + 1);
        }

        return ans;
    }
}
