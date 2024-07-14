import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GroupAnagramsPractice {
    public void main(String[] args) {
        String[] strs = new String[] { "eat", "tea", "tan", "ate", "nat", "bat" };
        List<List<String>> groups = groupAnagrams(strs);
        groups.forEach(System.out::println);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Set<String> visited = new HashSet<>();

        for (int i = 0; i < strs.length; i++) {
            if (visited.add(strs[i])) {
                List<String> newGroup = new ArrayList<>();
                newGroup.add(strs[i]);
                result.add(newGroup);

                for (int j = i + 1; j < strs.length; j++) {
                    if (isAnagram(newGroup.getFirst(), strs[j])) {
                        newGroup.add(strs[j]);
                        visited.add(strs[j]);
                    }
                }
            }
        }
        return result;
    }

    private boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int i : count)
            if (i != 0)
                return false;

        return true;
    }
}
