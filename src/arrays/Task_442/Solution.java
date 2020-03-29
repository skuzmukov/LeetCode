package arrays.Task_442;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int[] arr = new int[nums.length + 1];
        for (int i : nums) {
            arr[i] ++;
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 2) {
                res.add(i);
            }
        }
        return res;
    }
}