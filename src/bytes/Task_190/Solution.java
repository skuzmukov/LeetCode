package bytes.Task_190;
//https://leetcode.com/problems/reverse-bits/
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int bit;
        int res = 0;
        int i = 0;
        while (i < 32) {
            bit = n >> i & 1;
            res |= bit << (31 - i);
            i++;
        }
        return res;
    }
}