package arrays.Task_374;
//https://leetcode.com/problems/guess-number-higher-or-lower/
public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int h = 1;
        int t = n;
        int m;
        int res;
        while (h <= t) {
            m = (t + h) >>> 1; // or h + (t - h) / 2
            res = guess(m);
            if (res > 0) {
                h = m + 1;
            } else if (res < 0) {
                t = m - 1;
            } else {
                return m;
            }
        }
        return -1;
    }
}

class GuessGame {
    int guess(int val) { return 0; }
}
