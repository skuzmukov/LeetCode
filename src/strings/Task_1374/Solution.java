package strings.Task_1374;

public class Solution {
    public String generateTheString(int n) {
        char[] res = new char[n];
        if (n % 2 == 1) {
            for (int i = 0; i < n; i++) {
                res[i] = 'x';
            }
            return String.valueOf(res);
        } else {
            for (int i = 0; i < n - 1; i++) {
                res[i] = 'x';
            }
            res[n - 1] = 'z';
            return String.valueOf(res);
        }
    }
}