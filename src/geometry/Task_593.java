package geometry;

//https://leetcode.com/problems/valid-square/
public class Task_593 {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        if (p1[0] == p2[0] && p1[0] == p3[0] && p1[0] == p4[0] && p1[1] == p2[1] && p1[1] == p3[1] && p1[1] == p4[1]) {
            return false;
        }

        return isSquare(p1, p2, p3, p4) || isSquare(p1, p4, p2, p3) || isSquare(p1, p3, p4, p2);
    }

    private boolean isSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        return distance(p1, p2) == distance(p1, p4)
                && distance(p1, p4) == distance(p4, p3)
                && distance(p1, p3) == distance(p2, p4)
                && distance(p3, p2) == distance(p3, p4);
    }

    public double distance(int[] x, int[] y) {
        return Math.sqrt(Math.pow((x[0] - y[0]), 2) + Math.pow((x[1] - y[1]), 2));
    }
}