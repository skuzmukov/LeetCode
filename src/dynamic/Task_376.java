package dynamic;
//https://leetcode.com/problems/wiggle-subsequence/
public class Task_376 {
    public int wiggleMaxLength(int[] nums) {

        if (nums.length < 2) { return nums.length; }

        int[] withoutDuplicates = new int[nums.length];
        withoutDuplicates[0] = nums[0];

        int ind = 1;
        for (int i = 1; i < nums.length; i++) {
            if (withoutDuplicates[ind - 1] != nums[i]) {
                withoutDuplicates[ind++] = nums[i];
            }
        }

        if (ind <= 2) { return ind; }

        int index = 0;
        boolean[] dp = new boolean[nums.length - 1];

        for (int i = 0; i < ind - 1; i++) {
            dp[index++] = withoutDuplicates[i] > withoutDuplicates[i + 1];
        }

        int curr = 1;

        for (int i = 0; i < index - 1; i++) {
            if (dp[i] != dp[i + 1]) {
                curr++;
            }
        }

        return curr + 1;
    }
}


/*
*
* Описание!
* Посмотреть вариант с leetcode
*
* */