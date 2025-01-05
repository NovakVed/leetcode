package neetCode.arraysAndHashing.validAnagram.practice;

public class ValidAnagram2 {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }

    private static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int n : count)
            if (n != 0)
                return false;

        return true;
    }

}
