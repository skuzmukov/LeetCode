package bytes.Task_1009;

public class Solution {
    public int bitwiseComplement(int N) {
        int count = 0;
        int temp;
        for (int i = 0; i < 32; i++) {
            temp = N >> i & 1;
            if (temp == 1) { count = i;}
        }
        for (int i = 0; i <= count; i++) {
            N ^= 1 << i;
        }
        return N;
    }
}