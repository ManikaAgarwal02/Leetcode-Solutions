class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;

        for (int x : piles) {
            high = Math.max(high, x);
        }

        int ans = high;

        while (low <= high) {
            int k = low + (high - low) / 2;

            long hours = 0;

            for (int x : piles) {
                hours += (x + k - 1) / k;
            }

            if (hours <= h) {
                ans = k;
                high = k - 1;
            } else {
                low = k + 1;
            }
        }

        return ans;
    }
}