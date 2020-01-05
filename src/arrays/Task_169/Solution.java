package arrays.Task_169;

class Solution {
    public int majorityElement(int[] nums) {
        int frequency = 0;
        int majority = -1;
        for (int i : nums) {
            if (frequency == 0) {
                majority = i;
            }
            frequency += i == majority ? 1 : -1;
        }
        return majority;
    }
}