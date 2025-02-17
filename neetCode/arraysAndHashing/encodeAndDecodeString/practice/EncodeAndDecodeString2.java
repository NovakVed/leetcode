package neetCode.arraysAndHashing.encodeAndDecodeString.practice;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeString2 {
    public static void main(String[] args) {
        List<String> strs = List.of("neet", "code", "love", "you");
        String encode = encode(strs); // 4#neet4#code4#love3#you
        List<String> decode = decode(encode);
        System.out.println(decode.toString());
    }

    public static String encode(List<String> strs) {
        StringBuilder sBuilder = new StringBuilder();
        for (String s : strs)
            sBuilder.append(s.length()).append("#").append(s);
        return sBuilder.toString();
    }

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
