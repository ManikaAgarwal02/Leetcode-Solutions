class Solution {
    public int maximumCandies(int[] candies, long k) {
        
        long sum = 0;
        int max = 0;

        for (int x : candies) {
            sum += x;
            max = Math.max(max, x);
        }
        if (sum < k) {
            return 0;
        }

        int l = 1;
        int h = max;
        int ans = 0;

        while (l <= h) {
            int mid = l + (h - l) / 2;
            long children = 0;
            for (int x : candies) {
                children += x / mid;
            }
            if (children >= k) {
                ans = mid;
                l= mid + 1;
            } else {
                h= mid - 1;
            }
        }

        return ans;
    }
}