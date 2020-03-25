package arrays.Task_1365;

import java.util.Arrays;

public class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sorted = new int[nums.length];
        System.arraycopy(nums, 0, sorted, 0, nums.length);
        Arrays.sort(sorted);
        int[] res = new int[nums.length];
        int index;
        for (int i = 0; i < nums.length; i++) {
            index = binarySearch(sorted, nums[i]);
            res[i] = index;
        }
        return res;
    }

    private int binarySearch(int[] arr, int key) {
        int m;
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            m = (i + j) / 2;
            if (arr[m] > key) {
                j = m - 1;
            } else if (arr[m] < key) {
                i = m + 1;
            } else if (m - 1 >= 0 && arr[m - 1] == key) {
                j = m - 1;
            } else {
                return m;
            }
        }
        return -1;
    }
}

