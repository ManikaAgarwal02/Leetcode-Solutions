class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        int ans = -1;

        for (int i = 0; i <= n - k; i++) {
            for (int j = i; j < i + k; j++) {
                int count = 0;

                for (int x = 0; x <= n - k; x++) {
                    for (int y = x; y < x + k; y++) {
                        if (nums[y] == nums[j]) {
                            count++;
                            break;
                        }
                    }
                }

                if (count == 1) {
                    ans = Math.max(ans, nums[j]);
                }
            }
        }

        return ans;
    }
}