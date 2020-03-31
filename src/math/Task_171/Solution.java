package math.Task_171;

public class Solution {
    public int titleToNumber(String s) {
        int counter = 1;
        int sum = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            sum += counter * ((int) s.charAt(i) - 'A' + 1);
            counter *= 26;
        }
        return sum;
    }
}
