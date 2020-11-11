package lists;

import java.util.Arrays;

public class Task_57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] arr = new int[intervals.length + 1][2];
        arr[0] = newInterval;
        System.arraycopy(intervals, 0, arr, 1, intervals.length);

        Arrays.sort(arr, (o1, o2) -> o1[0] - o2[0]);

        int l = arr[0][0];
        int r = arr[0][1];

        int index = 0;
        int[][] result = new int[arr.length][2];

        for (int i = 1; i < arr.length; i++) {
            if (r >= arr[i][0]) {
                r = Math.max(arr[i][1], r);
            } else {
                result[index][0] = l;
                result[index][1] = r;

                index ++;

                l = arr[i][0];
                r = arr[i][1];
            }
        }

        result[index][0] = l;
        result[index][1] = r;

        return Arrays.copyOf(result, index + 1);
    }
}

/*
*
Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
Output: [[1,2],[3,10],[12,16]]
*
*   Создаем новый массив result длины intervals.length + 1
* Добавялем в новый массив arr все интервалы из intervals и newInterval
* Сортируем массив arr по левому концу интервалов - по возрастанию
* В переменные l и r записываем левый и правый конец первого интервала из массива arr
* После чего итерируем через оставшиеся интервалы
* Если r >= левой границы интервала - считаем r = max(r, правая граница)
* Иначе - записываем l и r в качестве нового интервала в result
* Принимаем за l и r концы текущего интервала.
* В конце, после итерирования добавляем текущие l и r как новый интервал в ответ.
*/