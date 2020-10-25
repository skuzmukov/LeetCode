package arrays;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/4sum-ii/
public class Task_454 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>(2 * A.length + 1);
        int sum = 0;
        int count = 0;

        Integer rest = null;

        for (int value : A) {
            for (int i : B) {
                sum = value + i;
                count = map.getOrDefault(sum, 0) + 1;
                map.put(sum, count);
            }
        }

        for (int value : C) {
            for (int i : D) {
                sum = (-1) * (value + i);
                rest = map.get(sum);
                if (rest != null) {
                    res += rest;
                }
            }
        }
        return res;
    }
}

/*
*
Input:
A = [ 1, 2]
B = [-2,-1]
C = [-1, 2]
D = [ 0, 2]

Output:
2
* Бежим по первому и второму массиву и ищем попарную сумму элементов, результат записываем в map, где ключ - сумму элементов, а значение - количество таких сумм
* Бежим по третьему и четвертому массиву и ищем попарную сумму элементов, после чего ищем эту сумму как ключ в map со знаком -, это означает, что сумма всех 4 элементов равна 0
* к результату прибавляем количество таких сумм из map
* */