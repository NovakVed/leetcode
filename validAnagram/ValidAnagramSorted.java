package validAnagram;

import java.util.Arrays;

class ValidAnagramSorted {
    public void main(String[] args) {
        String s = "ca", t = "ac";
        System.out.println(isAnagram(s, t));
    }

    public boolean isAnagram(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);
    }
}
