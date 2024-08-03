package validAnagram.practice;

class ValidAnagram1 {
    public static void main(String[] args) {
        String s = "maam", t = "mama";

        if (isAnagram(s, t))
            System.out.println("Anagram");
        else
            System.out.println("Not anagram");
    }

    private static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int i : count) if (count[i] != 0) return false;
        return true;
    }
}
