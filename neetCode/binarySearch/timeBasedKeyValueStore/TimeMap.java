import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 981. Time Based Key-Value Store
 * {@link} <a href=
 * "https://leetcode.com/problems/time-based-key-value-store/">981. Time Based
 * Key-Value Store</a>
 */
class TimeMap {

    private Map<String, List<Pair<String, Integer>>> keyStore;

    public TimeMap() {
        keyStore = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        keyStore.computeIfAbsent(key, k -> new ArrayList<>()).add(new Pair<>(value, timestamp));
    }

    public String get(String key, int timestamp) {
        List<Pair<String, Integer>> values = keyStore.getOrDefault(key, new ArrayList<>());
        int l = 0, r = values.size() - 1;
        String result = "";

        while (l <= r) {
            int m = l + (r - l) / 2;
            if (values.get(m).getRight() <= timestamp) {
                result = values.get(m).getLeft();
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return result;
    }

    private static class Pair<K, V> {
        private final K left;
        private final V right;

        public Pair(K key, V value) {
            this.left = key;
            this.right = value;
        }

        public K getLeft() {
            return left;
        }

        public V getRight() {
            return right;
        }
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */