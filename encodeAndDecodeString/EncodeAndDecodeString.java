package encodeAndDecodeString;

import java.util.ArrayList;
import java.util.List;

class EncodeAndDecodeString {
    public static void main(String[] args) {
        List<String> strs = List.of("neet", "code", "love", "you");
        String encoded = encode(strs);
        List<String> decoded = decode(encoded);
        System.out.println(decoded);
    }

    public static String encode(List<String> strs) {
        return "";
    }

    public static List<String> decode(String str) {
        return new ArrayList<>();
    }
}
