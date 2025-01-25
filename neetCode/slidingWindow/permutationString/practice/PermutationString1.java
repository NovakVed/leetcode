package neetCode.slidingWindow.permutationString.practice;

import java.util.Arrays;

public class PermutationString1 {
    public static void main(String[] args) {
        String s1 = "adca";
        String s2 = "dcda";
        System.out.println(checkInclusion(s1, s2));
    }

    public static boolean checkInclusion(String s1, String s2) {
        int l = 0;
        int[] arr1 = populateArr(s1);
        int[] arr2 = new int[26];

        for (int r = 0; r < s2.length(); r++) {
            arr2[s2.charAt(r) - 'a']++;

            if (r - l > s1.length() - 1)
                arr2[s2.charAt(l++) - 'a']--;

            if (r - l == s1.length() - 1)
                if (Arrays.equals(arr1, arr2))
                    return true;
        }

        return false;
    }

    private static int[] populateArr(final String s1) {
        int[] arr = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i) - 'a']++;
        }
        return arr;
    }
}