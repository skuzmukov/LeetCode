package math;

//https://leetcode.com/problems/robot-bounded-in-circle
public class Task_1041 {
    public boolean isRobotBounded(String instructions) {
        int[] cardinalPoints = new int[] {0, 0, 0, 0};
        int direction = 1;
        for (char c : instructions.toCharArray()) {
            if ('L' == c) {
                if (direction == 0) {
                    direction = 3;
                } else {
                    direction --;
                }
            } else if ('R' == c) {
                if (direction == 3) {
                    direction = 0;
                } else {
                    direction ++;
                }
            } else {
                cardinalPoints[direction] ++;
            }
        }
        return (cardinalPoints[1] == cardinalPoints[3] && cardinalPoints[0] == cardinalPoints[2]) || direction != 1;
    }
}