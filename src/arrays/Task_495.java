package arrays;

//https://leetcode.com/problems/teemo-attacking/
public class Task_495 {
    public int findPoisonedDuration(int[] times, int d) {

        if (times.length == 0) { return 0; }

        int st = 0;
        int r = times[st] + d;

        int res = 0;
        for (int i = 1; i < times.length; i++) {
            if (r >= times[i]) {
                r = Math.max(r, times[i] + d);
            } else {
                res += r - times[st];
                st = i;
                r = times[st] + d;
            }
        }

        return res + r - times[st];
    }
}