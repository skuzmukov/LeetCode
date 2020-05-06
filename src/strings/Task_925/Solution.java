package strings.Task_925;
//https://leetcode.com/problems/long-pressed-name/
public class Solution {
    public boolean isLongPressedName(String name, String typed) {
        if (name.length() > typed.length()) { return false; }
        int n = 0;
        int t = 0;
        while (n < name.length() || t < typed.length()) {
            if (n == name.length() || t == typed.length() || name.charAt(n) != typed.charAt(t)) { return false; }
            while (n < name.length() && t < typed.length() && name.charAt(n) == typed.charAt(t)) {
                n ++;
                t ++;
            }
            while (t < typed.length() && typed.charAt(t - 1) == typed.charAt(t)) { t ++; }
        }
        return true;
    }
}