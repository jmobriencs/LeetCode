import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        for (int i = 0; i < arr1.length; i++) {
            map1.put(arr1[i], map1.getOrDefault(arr1[i], 0) + 1);
            map2.put(arr2[i], map2.getOrDefault(arr2[i], 0) + 1);
        }
        return map1.equals(map2);
    }
}
