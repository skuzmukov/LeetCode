package math.Task_264;
//https://leetcode.com/problems/ugly-number-ii/
public class Solution {
    public int nthUglyNumber(int n) {
        int res = 1;
        int curr = 1;
        while (res <= n) {
            if (ugly(curr)) { res ++; }
            curr ++;
        }
        return curr - 1;
    }

    boolean ugly(int n) {
        if (n == 1) { return true; }
        if (n % 2 == 0) { return ugly(n / 2); }
        if (n % 3 == 0) { return ugly(n / 3); }
        if (n % 5 == 0) { return ugly(n / 5); }
        return false;
    }
}
// TLE 499/596