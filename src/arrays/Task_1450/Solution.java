package arrays.Task_1450;
//https://leetcode.com/problems/number-of-students-doing-homework-at-a-given-time
public class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int res = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i] <= queryTime && queryTime <= endTime[i]) { res ++; }
        }
        return res;
    }
}