import java.util.HashSet;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length <= 1) return false;

        HashSet<Integer> set = new HashSet<>();

        for (int i : nums) {
            if (set.contains(i)) return true;
            set.add(i);
        }
        return false;
    }
}