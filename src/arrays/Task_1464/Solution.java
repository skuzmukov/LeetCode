package arrays.Task_1464;
//https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
public class Solution {
    public int maxProduct(int[] nums) {
        int[] freq = new int[1001];
        for (int i : nums) {
            freq[i] ++;
        }
        int counter = 0;
        int res = 1;
        int j = freq.length - 1;
        while (counter < 2) {
            if (freq[j]-- > 0) {
                counter++;
                res *= (j - 1);
            } else {
                j --;
            }
        }
        return res;
    }
}