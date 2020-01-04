package arrays.Task_75;

import java.util.Arrays;

public class Solution {
    public void sortColors(int[] nums) {
        // 1
        int[] arr = new int[3];
        for (int i : nums) {
            arr[i] ++;
        }

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            while (arr[i]-- > 0) {
                nums[index++] = i;
            }
        }

        // 2 complexity for condition of swap !!!
        int i = 0;
        int j;
        int colorCount = 2;
        for (int x = 0; x < colorCount; x++) {
            j = i + 1;
            while (j < nums.length) {
                while (i < nums.length && nums[i] == x) {i++;}
                while (j < nums.length && nums[j] != x) {j++;}
                if (j < nums.length && i < j) {
                    nums[i] = nums[i] + nums[j];
                    nums[j] = nums[i] - nums[j];
                    nums[i] = nums[i] - nums[j];
                    i++;
                }
                j++;
            }
        }
    }
}