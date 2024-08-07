package encodeAndDecodeString;

import java.util.ArrayList;
import java.util.List;

class EncodeAndDecodeString {
    public static void main(String[] args) {
        List<String> strs = List.of("neet", "code", "love", "you");
        String encoded = encode(strs);
        System.out.println("encoded: " + encoded);
        List<String> decoded = decode(encoded);
        System.out.println("decoded: " + decoded);
    }

    public static String encode(List<String> strs) {
        StringBuilder encode = new StringBuilder();
        for (String word : strs) {
            encode.append(word.length()).append("#").append(word);
        }
        return encode.toString();
    }

    // -> #4neet#4code#4love#3you

    public static List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#')
                j++;

            int length = Integer.valueOf(str.substring(i, j));
            i = j + 1 + length;
            result.add(str.substring(j + 1, i));
        }

        return result;
    }
}
