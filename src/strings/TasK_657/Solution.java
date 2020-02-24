package strings.TasK_657;

public class Solution {
    public boolean judgeCircle(String moves) {
        int upDown = 0;
        int leftRight = 0;
        for (char c : moves.toCharArray()) {
            if (c == 'R') {
                leftRight ++;
            } else if (c == 'L') {
                leftRight --;
            } else if (c == 'U') {
                upDown ++;
            } else if (c == 'D') {
                upDown --;
            }
        }
        return upDown == 0 && leftRight == 0;
    }
}