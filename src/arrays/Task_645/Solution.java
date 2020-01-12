package arrays.Task_645;

public class Solution {
    public int[] findErrorNums(int[] nums) {
        int sum = 0;
        int n = nums.length;
        int sumOfArithmeticProgression = n * (n + 1) / 2;
        for (int i : nums) {
            sum += i;
        }
        int[] sorted = new int[nums.length + 1];
        for (int i : nums) {
            sorted[i] ++;
            if (sorted[i] > 1) {
                return new int[] {i, i + (sumOfArithmeticProgression - sum)};
            }
        }
        return null;
    }
}