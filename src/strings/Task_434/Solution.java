package strings.Task_434;

public class Solution {
    public int countSegments(String s) {
        int res = 0;
        int i = 0;
        while (i < s.length() && s.charAt(i) == ' ') { i ++; }
        while (i < s.length()) {
            res ++;
            while (i < s.length() && s.charAt(i) != ' ') { i ++; }
            while (i < s.length() && s.charAt(i) == ' ') { i ++; }
        }
        return res;
    }
}