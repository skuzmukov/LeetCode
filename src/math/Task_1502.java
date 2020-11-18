package math;

import java.util.Arrays;
//https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/
public class Task_1502 {
    public boolean canMakeArithmeticProgression(int[] arr) {
        if (arr.length < 3) { return true; }
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        for (int i = 2; i < arr.length; i++) {
            if (diff != arr[i] - arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}

/**
 * Если в массиве меньше 3 элементов (по условию мб 2) - последовательность элементов - прогрессия
 * Иначе
 * Сортируем
 * В diff записываем между вторым и первым элементами.
 * Поочередно сравниваем разницу между двумя соседними элементами с diff
 *      Если не равны - возвращаем false
 * Возвращаем true
 *
 * */