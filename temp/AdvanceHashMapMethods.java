package temp;

import java.util.Map;
import java.util.HashMap;

class AdvanceHashMapMethods {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>() {
            {
                put("1", "foo");
                put("2", "bar");
                put("2", "veki");
            }
        };

        // map.computeIfPresent("1", (v, k) -> "veki");
        // map.computeIfAbsent("1", k -> "veki");
        // map.computeIfAbsent("3", k -> "veki3");
        // map.putIfAbsent("2", "veki3");
        System.out.println(map);
        System.out.println(map.getOrDefault(3, "hello"));
    }
}
