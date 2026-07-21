import java.util.*;

class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0, sumB = 0;

        for (int x : aliceSizes)
            sumA += x;

        Set<Integer> set = new HashSet<>();

        for (int x : bobSizes) {
            sumB += x;
            set.add(x);
        }

        int diff = (sumA - sumB) / 2;

        for (int a : aliceSizes) {
            int b = a - diff;
            if (set.contains(b)) {
                return new int[]{a, b};
            }
        }

        return new int[]{};
    }
}