package arrays.Task_496;

import java.util.Arrays;

public class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i : nums2) {
            max = Math.max(max, i);
            min = Math.min(min, i);
        }
        int[] arr = new int[max - min + 1];
        for (int i = 0; i < nums2.length; i++) {
            arr[nums2[i] - min] = i;
        }
        Arrays.fill(res, -1);
        for (int i = 0; i < nums1.length; i++) {
            int index = arr[nums1[i] - min];
            while (++index < nums2.length) {
                if (nums1[i] < nums2[index]) {
                    res[i] = nums2[index];
                    break;
                }
            }
        }
        return res;
    }
}