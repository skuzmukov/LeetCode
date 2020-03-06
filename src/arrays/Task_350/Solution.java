package arrays.Task_350;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0)  { return new int[] {}; }
        if (nums1.length < nums2.length) {
            return arr(nums1, nums2);
        } else {
            return arr(nums2, nums1);
        }
    }

    public int[] arr(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i : nums1) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int[] res = new int[nums1.length];
        int ind = 0;
        Integer val = 0;

        for (int i : nums2) {
            val = map.get(i);
            if (val != null && val.intValue() > 0) {
                res[ind++] = i;
                map.put(i, val.intValue() - 1);
            }
        }

        return Arrays.copyOf(res, ind);
    }
}
