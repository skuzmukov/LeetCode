package strings.Task_389;

public class Solution {
    public char findTheDifference(String s, String t) {
        return (char) (addValue(t) - addValue(s));
    }

    int addValue(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            res += s.charAt(i);
        }
        return res;
    }
}
