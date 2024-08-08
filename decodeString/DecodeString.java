package decodeString;

/**
 * 394. Decode String
 * 
 * @link <a href="https://leetcode.com/problems/decode-string/description/">394.
 *       Decode String</a>
 */
class DecodeString {
    public static void main(String[] args) {
        String s = "3[a]2[bc]";

        // Output: "aaabcbc"
        System.out.println(decodeString(s));
    }

    public static String decodeString(String s) {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while (i < s.length()) {
            int charSequenceLength = i + 1;
            while (s.charAt(charSequenceLength) != ']') {
                charSequenceLength++;
            }

            int repeat = Integer.valueOf(s.substring(i, i + 1));
            for (int j = 0; j < repeat; j++) {
                sb.append(s.substring(i + 2, charSequenceLength));
            }
            i = charSequenceLength + 1;
        }

        return sb.toString();
    }
}
