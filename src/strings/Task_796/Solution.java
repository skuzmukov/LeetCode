package strings.Task_796;

public class Solution {
    public boolean rotateString(String A, String B) {
        if (A.length() != B.length()) { return false; }
        if (A.length() == 0) { return true; }
        char f = A.charAt(0);
        int N = A.length();
        int st = B.indexOf(f);
        while (st != -1) {
            int i;
            for (i = 1; i < N; i++) {
                if (A.charAt(i) != B.charAt((st + i) % N)) {
                    i = -1;
                    break;
                }
            }
            if (i == N) {
                return true;
            } else {
                st = B.indexOf(f, st + 1);
            }
        }
        return false;
    }
}