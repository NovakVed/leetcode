package longestCommonPrefix;

/**
 * 14. LongestCommonPrefix
 * {@link} <a href="https://leetcode.com/problems/longest-common-prefix/description/">14. LongestCommonPrefix</a>
 */
class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] input = new String[] { "aa", "ab" };
        System.out.println(longestCommonPrefix(input));
    }

    static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        String prefix = strs[0];
        for (String s : strs)
            while (s.indexOf(prefix) != 0)
                prefix = prefix.substring(0, prefix.length() - 1);
        return prefix;
    }

    // static String longestCommonPrefix(String[] strs) {
    // if (strs.length < 1 || strs.length > 200) {
    // return "";
    // }

    // String prefix = strs[0];
    // int prefixLength = 0;
    // for (int i = 1; i < strs.length; i++) {
    // if (strs[i].length() < 0 || strs[i].length() > 200) {
    // return "";
    // }

    // if (prefixLength > strs[i].length()) {
    // prefixLength = strs[i].length();
    // }

    // for (int j = 0; j < prefixLength; j++) {
    // if (strs[i].charAt(j) != prefix.charAt(j)) {
    // prefixLength = j;
    // break;
    // }
    // }
    // }

    // return prefix = prefix.substring(0, prefixLength);
    // }
}