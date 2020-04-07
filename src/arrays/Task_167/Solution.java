package arrays.Task_167;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int curr;
        int len = numbers.length - 1;
        for (int i = 0; i < numbers.length - 1; i++) {
            curr = binarySearch(target - numbers[i], numbers, i + 1, len);
            if (curr != -1) { return new int[] {i + 1, curr + 1}; }
        }
        return null;
    }

    private int binarySearch(int k, int[] nums, int h, int t) {
        int m;
        while (h <= t) {
            m = (h + t) / 2;
            if (nums[m] == k) {
                return m;
            } else if (k < nums[m]) {
                t = m - 1;
            } else {
                h = m + 1;
            }
        }
        return -1;
    }
}
