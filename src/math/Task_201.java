package math;
//https://leetcode.com/problems/bitwise-and-of-numbers-range/
public class Task_201 {
    public int rangeBitwiseAnd(int m, int n) {
        if (m == 0 || m == n) { return m; }

        int res = 0;
        int lastByte;
        int ind = 0;

        int temp = m;
        while(true) {
            lastByte = 1;
            while (temp <= n) {
                lastByte &= temp & 1;
                if (lastByte == 0) {
                    break;
                }
                temp++;
            }

            res |= (lastByte << ind);
            ind ++;

            m /= 2;
            if (m == 0) { return res; }
            n /= 2;
            temp = m;
        }
    }
}
