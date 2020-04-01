package strings.Task_125;

public class Solution {
    public boolean isPalindrome(String s) {
        int h = 0;
        int N = s.length();
        int t = N - 1;
        while (h < t) {
            while (h < t && !Character.isLetterOrDigit(s.charAt(h))) {h ++; }
            while (t > h && !Character.isLetterOrDigit(s.charAt(t))) {t --; }
            if (Character.toLowerCase(s.charAt(h)) != Character.toLowerCase(s.charAt(t))) {
                return false;
            } else {
                h ++;
                t --;
            }
        }
        return true;
    }
}