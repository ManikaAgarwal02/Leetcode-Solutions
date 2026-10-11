import java.util.*;

class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int duplicate = -1;
        int missing = -1;
        int n = nums.length;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int i = 1; i <= n; i++) {
            if (map.containsKey(i)) {
                if (map.get(i) == 2) {
                    duplicate = i;
                }
            } else {
                missing = i;
            }
        }

        return new int[]{duplicate, missing};
    }
}