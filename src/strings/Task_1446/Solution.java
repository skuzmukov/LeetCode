package strings.Task_1446;
//https://leetcode.com/problems/consecutive-characters/
public class Solution {
    public int maxPower(String s) {
        int power = 1;
        int curr = 1;
        char c = 0;
        for (char x : s.toCharArray()) {
            if (c != x) {
                power = Math.max(power, curr);
                curr = 1;
                c = x;
            } else {
                curr ++;
            }
        }
        return power;
    }
}