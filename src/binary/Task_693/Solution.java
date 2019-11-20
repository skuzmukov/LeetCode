package binary.Task_693;

class Solution {
    public boolean hasAlternatingBits(int n) {
        int rem = n % 2;
        int i;
        while(n > 0) {
            n /= 2;
            i = n % 2;
            if (i == rem) {
                return false;
            }
            rem = i;
        }
        return true;
    }
}
