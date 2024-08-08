package encodeAndDecodeString.practice;

import java.util.ArrayList;
import java.util.List;

class EncodeAndDecodeString1 {
    public static void main(String[] args) {
        List<String> strs = List.of("neet", "code", "love", "you");
        String encoded = encode(strs);
        System.out.println("encoded: " + encoded);
        List<String> decoded = decode(encoded);
        System.out.println("decoded: " + decoded);
    }

    // -> 4#neet4#code4#love3#you

    public static String encode(List<String> strs) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : strs)
            stringBuilder.append(s.length()).append("#").append(s);
        return stringBuilder.toString();
    }

    public static List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }

            int length = Integer.valueOf(str.substring(i, j));
            i = j + 1 + length;
            result.add(str.substring(j + 1, i));
        }
        return result;
    }
}
