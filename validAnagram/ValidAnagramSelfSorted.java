package validAnagram;

import java.util.Arrays;

/**
 * 242. Valid Anagram
 * {@link} <a href="https://leetcode.com/problems/valid-anagram/description/">42. Valid Anagram</a>
 */
class ValidAnagramSelfSorted {
    void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s, t));
    }

    boolean isAnagram(final String s, final String t) {
        char[] sCharArr = s.toCharArray();
        char[] tCharArr = t.toCharArray();

        quickSort(sCharArr, 0, sCharArr.length - 1);
        quickSort(tCharArr, 0, tCharArr.length - 1);

        return Arrays.equals(sCharArr, tCharArr);
    }

    void quickSort(char[] s, int l, int r) {
        if (l >= r) {
            return;
        }

        int p = partition(s, l, r);
        quickSort(s, l, p - 1);
        quickSort(s, p + 1, r);
    }

    int partition(char[] s, int l, int r) {
        int pivot = s[r];
        int i = l - 1;
        for (int j = l; j < r; j++) {
            if (s[j] <= pivot) {
                i++;
                swap(s, i, j);
            }
        }

        swap(s, i + 1, r);
        return i;
    }

    void swap(char[] s, int a, int b) {
        char temp = s[a];
        s[a] = s[b];
        s[b] = temp;
    }
}
