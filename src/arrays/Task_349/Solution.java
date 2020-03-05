package arrays.Task_349;

import java.util.Arrays;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) { return new int[] {}; }
        if (nums1.length < nums2.length) {
            return arr(nums1, nums2);
        } else {
            return arr(nums2, nums1);
        }
    }

    int[] arr(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        int max = Integer.MIN_VALUE;
        for (int i : nums1) {
            if (max < i) {
                max = i;
            }
        }
        boolean[] arr = new boolean[max + 1];
        for (int i : nums1) {
            arr[i] = true;
        }
        int ind = 0;
        int len = arr.length;
        for (int i : nums2) {
            if (i < len && arr[i]) {
                res[ind++] = i;
                arr[i] = false;
            }
        }
        return Arrays.copyOf(res, ind);
    }
}