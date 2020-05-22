package math.Task_263;
//https://leetcode.com/problems/ugly-number/
public class Solution {
    public boolean isUgly(int num) {
        if (num < 1) { return false; }
        return ugly(num);
    }

    boolean ugly(int num) {
        if (num == 1) { return true; }
        if (num % 2 == 0) { return ugly(num / 2); }
        if (num % 3 == 0) { return ugly(num / 3); }
        if (num % 5 == 0) { return ugly(num / 5); }
        return false;
    }
}