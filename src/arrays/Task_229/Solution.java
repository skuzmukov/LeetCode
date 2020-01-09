package arrays.Task_229;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();

        int count = nums.length / 3;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i : nums) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }

        if (max - min + 1 < 0) {
            Map<Integer, Integer> frequency = new HashMap<>();
            for (int i : nums) {
                frequency.put(i, frequency.getOrDefault(i, 0) + 1);
            }

            for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
                if (entry.getValue() > count) {
                    res.add(entry.getKey());
                }
            }
        } else {
            int[] frequency = new int[max - min + 1];
            for (int i : nums) {
                frequency[i - min] ++;
            }
            for (int i = 0; i < frequency.length; i++) {
                if (frequency[i] > count) {
                    res.add(i + min);
                }
            }
        }
        return res;
    }
}