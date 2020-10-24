package math;

public class Task_1539 {
    public int findKthPositive(int[] arr, int k) {
        int val = 1;
        int counter = 1;
        int ind = 0;
        int len = arr.length;
        while (true) {
            if (ind < len && val == arr[ind]) {
                ind ++;
            } else {
                if (counter == k) { return val; }
                counter ++;
            }
            val ++;
        }
    }
}

/*
*
Input: arr = [2,3,4,7,11], k = 5
Output: 9
Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.
*
* Пробегаем по массиву значений, если индекс элемента меньше длины массива и значение val равно текущему значению в массиве - то переходим к след значению, обновляя индекс
* Иначе, считаем что у нас пропущенное число, обновляем значение пропущенного числа и counter
* Обновляем текущее значение val
* */