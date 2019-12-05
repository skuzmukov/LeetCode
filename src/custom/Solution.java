package custom;

import java.util.Arrays;

// Найти индексы двух элементов, дающих необходимую сумму. Все элементы уникальны.
public class Solution {
    public int[] twoSum(int[] nums, int target) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i : nums) {
            if (min > i) {min = i;}
            if (max < i) {max = i;}
        }

        int[] arr = new int[max - min + 1];
        for(int i = 0; i < nums.length; i++) {
            arr[nums[i] - min] = i + 1;
        }

        for (int i = 0; i < nums.length; i++) {
            if (arr[i] != 0 && arr[target - 2 * min - i] != 0) {
                return new int[] {arr[i] - 1, arr[target - 2 * min - i] - 1};
            }
        }

        return null;
    }
}