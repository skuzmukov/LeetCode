package arrays.Task_896;

public class Solution {
    public boolean isMonotonic(int[] A) {
        if (A.length < 2) { return true; }
        int i = 0;
        int compare = -2;
        int curr;
        while (i < A.length - 1 && compare == -2) {
            curr = Integer.compare(A[i], A[i + 1]);
            i++;
            if (curr == 0) { continue; }
            compare = curr;
        }
        for (; i < A.length - 1; i++) {
            curr = Integer.compare(A[i], A[i + 1]);
            if (curr == 0) { continue; }
            if (curr != compare) {
                return false;
            }
        }
        return true;
    }
}
