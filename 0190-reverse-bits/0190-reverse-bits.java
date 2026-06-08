class Solution {
    public int reverseBits(int num) {
        int rev = 0;

        for(int i = 0; i < 32; i++){
            rev = (rev << 1) | (num & 1);
            num = num >> 1;
        }

        return rev;
    }
}