package arrays.Task_349;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int maxF = Integer.MIN_VALUE;
        int minF = Integer.MAX_VALUE;
        for (int i : nums1) {
            maxF = Math.max(i, maxF);
            minF = Math.min(i, minF);
        }
        boolean[] f = new boolean[maxF - minF + 1];
        for (int i : nums1) {
            f[i - minF] = true;
        }
        // use one min and one max for two arrays 
        int maxS = Integer.MIN_VALUE;
        int minS = Integer.MAX_VALUE;

        for (int i : nums2) {
            maxS = Math.max(i, maxS);
            minS = Math.min(i, minS);
        }
        boolean[] s = new boolean[maxS - minS + 1];

        for (int i : nums2) {
            s[i - minS] = true;
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < s.length; i++) {
            if (s[i] && i + minS - minF >= 0 && i + minS - minF < f.length && f[i + minS - minF]) {
                res.add(i + minS);
            }
        }
        // Array.copyOf()
        int[] arr = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            arr[i] = res.get(i);
        }
        return arr;
    }
}