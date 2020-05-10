package arrays.Task_997;
//https://leetcode.com/problems/find-the-town-judge/
public class Solution {
    public int findJudge(int N, int[][] trust) {
        int[] from = new int[N + 1];
        int[] to = new int[N + 1];
        for (int[] t : trust) {
            from[t[0]] ++;
            to[t[1]] ++;
        }
        for (int i = 1; i < N + 1; i++) {
            if (from[i] == 0 && to[i] == N - 1) {
                return i;
            }
        }
        return -1;
    }
}