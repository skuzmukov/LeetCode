package arrays;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/4sum-ii/
public class Task_454 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int res = 0;
        res += count(sumOfElements(A, B), sumOfElements(C, D));
        return res;
    }

    private Map<Integer, Integer> sumOfElements(int[] A, int[] B) {
        Map<Integer, Integer> map = new HashMap<>(2 * A.length + 1);
        int sum = 0;
        int count = 0;
        for (int i = 0; i < A.length; i ++) {
            for (int j = 0; j < B.length; j++) {
                sum = A[i] + B[j];
                count = map.getOrDefault(sum, 0) + 1;
                map.put(sum, count);
            }
        }
        return map;
    }

    private int count(Map<Integer, Integer> A, Map<Integer, Integer> B) {
        int res = 0;
        int key = 0;
        for (Map.Entry<Integer, Integer> entry : A.entrySet()) {
            key = (-1) * entry.getKey();
            if (B.containsKey(key)) {
                res += entry.getValue() * B.get(key);
            }
        }
        return res;
    }
}