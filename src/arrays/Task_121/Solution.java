package arrays.Task_121;

public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length < 2) { return 0; }
        int max = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (max < prices[i] - min) { max = prices[i] - min; }
            if (min > prices[i]) { min = prices[i]; }
        }
        return max;
    }
}