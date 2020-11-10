package math;
//https://leetcode.com/problems/xor-operation-in-an-array/
public class Task_1486 {
    public int xorOperation(int n, int start) {
        int i = 0;
        int res = 0;
        while (i < n) {
            res ^= start;
            start += 2;
            i++;
        }
        return res;
    }
}