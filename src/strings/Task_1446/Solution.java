package strings.Task_1446;
//https://leetcode.com/problems/consecutive-characters/


public class Solution {
    public int maxPower(String s) {
        int[] abc = new int[32];

        int count = 0;
        int c;
        int i = 0;

        int ind = 0;
        while (i < s.length()) {
            c = s.charAt(i);
            while (i < s.length() && s.charAt(i) == c) {
                count ++;
                i++;
            }
            ind = c - 'a';
            if (abc[ind] < count) {
                abc[ind] = count;
            }
            count = 0;
        }

        int max = 0;
        for (int val : abc) {
            if (val > max) {
                max = val;
            }
        }

        return max;
    }
}


/*
*
* Определяем массив длины 32 под алфавит - каждый индекс равен индексу буквы в алфавите.
* Приравниваем символ c текущему в строке, если равны - добавляем в count ++ и переставляем на следующий символ в строке
* Иначе если текущий count больше чем значение в abc - перезаписываем значение
*
*
* Возвращаем max элемент из abc.
*
* */