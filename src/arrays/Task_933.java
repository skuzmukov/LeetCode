package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//https://leetcode.com/problems/number-of-recent-calls/
public class Task_933 {

    
    private final List<Integer> calls = new ArrayList<>();

    public Task_933() { }

    public int ping(int t) {
        calls.add(t);
        int start = Collections.binarySearch(calls, t - 3000);
        if (start < 0) {
            return (calls.size() - ((-1)*(start + 1)));
        } else {
            return calls.size() - start;
        }
    }
}


/*
Input
["RecentCounter", "ping", "ping", "ping", "ping"]
[[], [1], [100], [3001], [3002]]
Output
[null, 1, 2, 3, 3]

Explanation
RecentCounter recentCounter = new RecentCounter();
recentCounter.ping(1);     // requests = [1], range is [-2999,1], return 1
recentCounter.ping(100);   // requests = [1, 100], range is [-2900,100], return 2
recentCounter.ping(3001);  // requests = [1, 100, 3001], range is [1,3001], return 3
recentCounter.ping(3002);  // requests = [1, 100, 3001, 3002], range is [2,3002], return 3
* На вход последовательно подаются числа t, сохраняем их в массив.
* Найти количество чисел из массива, попадающих в интервал [t - 3000, t] для текущего ping(t)
* Пользуясь, бинарным поиском - находим сколько чисел попадает в интервал.
* Если результат бинарного поиска выдает индекс > 0 - значит, найдено первое вхождение числа, попадающее в интервал.
* Иначе находим -(i + 1) индекс, откуда получаем i = (-1)*(i + 1) индекс, после которого все числа попадают в интервал
*
*/