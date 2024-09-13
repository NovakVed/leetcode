package neetCode.slidingWindow.permutationString;

import java.util.Arrays;

/**
 * 567. Permutation in String
 * {@link} <a href=
 * "https://leetcode.com/problems/permutation-in-string/">567. Permutation in
 * String</a>
 * Time complexity: O(26*n)
 */
class PermutationString {
    public static void main(String[] args) {
        String s1 = "adc";
        String s2 = "dcda";
        System.out.println(checkInclusion(s1, s2));
    }

    public static boolean checkInclusion(String s1, String s2) {
        int l = 0;
        int[] arrS1 = populateArr(s1);
        int[] arrS2 = new int[26];

        for (int r = 0; r < s2.length(); r++) {
            arrS2[s2.charAt(r) - 'a']++;

            if (r - l > s1.length() - 1)
                arrS2[s2.charAt(l++) - 'a']--;

            if (r - l == s1.length() - 1)
                if (Arrays.equals(arrS1, arrS2))
                    return true;
        }

        return false;
    }

    public static int[] populateArr(String s1) {
        int[] arr = new int[26];
        for (int i = 0; i < s1.length(); i++)
            arr[s1.charAt(i) - 'a']++;

        return arr;
    }
}