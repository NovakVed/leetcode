package neetCode.slidingWindow.longestRepeatingCharacterReplacement.practice;

class LongestRepeatingCharacterReplacement1 {
    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 2;
        System.out.println(characterReplacement(s, k));
    }

    public static int characterReplacement(String s, int k) {
        int longestSequence = 0;
        for (int l = 0; l < s.length(); l++) {
            if (longestSequence > s.length() - l)
                break;

            int replaced = k;
            int r = l;
            while (r < s.length() && (s.charAt(l) == s.charAt(r) || replaced > 0)) {
                if (s.charAt(l) != s.charAt(r)) {
                    replaced--;
                }
                r++;
            }
            longestSequence = Math.max(longestSequence, r - l);
        }

        return longestSequence;
    }
}
