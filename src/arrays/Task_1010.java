package arrays;

//https://leetcode.com/problems/pairs-of-songs-with-total-durations-divisible-by-60/
public class Task_1010 {
    public int numPairsDivisibleBy60(int[] time) {
        int[] modulo = new int[60];
        for (int value : time) {
            modulo[value % 60]++;
        }
        int res = ((modulo[0] * (modulo[0] - 1)) / 2) + ((modulo[30] * (modulo[30] - 1)) / 2);
        for (int i = 1; i < 30; i++) {
            res += modulo[i] * modulo[60 - i];
        }
        return res;
    }
}

/*
Input: time = [30,20,150,100,40]
Output: 3
Explanation: Three pairs have a total duration divisible by 60:
(time[0] = 30, time[2] = 150): total duration 180
(time[1] = 20, time[3] = 100): total duration 120
(time[1] = 20, time[4] = 40): total duration 60
*
*   Решено с помощью подсказок.
*   Идея состоит в том, что (A + B) % 60 = A % 60 + B % 60
*   Заводим массив modulo длины 60, в значение массива modulo[i] - количество элементов X из time для которых i = X % 60
*   Для элементов массива 0 и 30 - количество высчитывается через количество сочетаний без повторений, длины 2.
*   После чего пробегаем по всем элеменам массива с i 1 по 29, и в сумму добавляем произведение modulo[i] * modulo[60 - i]
*
*/