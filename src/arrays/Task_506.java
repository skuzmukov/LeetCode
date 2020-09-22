package arrays;

import java.util.Arrays;
//https://leetcode.com/problems/relative-ranks/
public class Task_506 {
    public String[] findRelativeRanks(int[] nums) {
        int maxScore = 0;
        for (int score : nums) {
            maxScore = Math.max(maxScore, score);
        }

        int[] stat = new int[maxScore + 1];

        Arrays.fill(stat, -1);

        for (int i = 0; i < nums.length; i++) {
            stat[nums[i]] = i;
        }

        String[] result = new String[nums.length];

        int counter = 0;
        for (int i = stat.length - 1; i >= 0; i--) {
            if (stat[i] >= 0) {
                counter ++;
                if (counter == 1) {
                    result[stat[i]] = "Gold Medal";
                } else if (counter == 2) {
                    result[stat[i]] = "Silver Medal";
                } else if (counter == 3) {
                    result[stat[i]] = "Bronze Medal";
                } else {
                    result[stat[i]] = String.valueOf(counter);
                }
            }
        }

        return result;

    }
}