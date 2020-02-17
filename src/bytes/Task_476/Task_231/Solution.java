package bytes.Task_476.Task_231;

public class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {return false;}
        int counter = 0;
        while (n > 0) {
            int x = n & 1;
            if (x == 1) {
                counter++;
                if (counter > 1) {
                    return false;
                }
            }
            n >>= 1;
        }

        return true;
    }
}