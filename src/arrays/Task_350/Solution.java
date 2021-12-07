package arrays.Task_350;

import java.util.*;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] sorted = new int[1001];
        for (int i : nums1) {
            sorted[i]++;
        }
        List<Integer> intersect = new ArrayList<>();
        for (int i : nums2) {
            if (sorted[i]-- > 0) {
                intersect.add(i);
            }
        }
        int[] result = new int[intersect.size()];
        for (int i = 0; i < intersect.size(); i++) {
            result[i] = intersect.get(i);
        }

        return result;
    }
}
