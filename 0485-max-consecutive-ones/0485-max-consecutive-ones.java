class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        List<Integer> l = new ArrayList<>();
        int c = 0;

        for (int num : nums) {
            if (num == 1) {
                c++;
            } else {
                l.add(c);
                c = 0;
            }
        }

        l.add(c); // Add the last sequence

        return Collections.max(l);
    }
}