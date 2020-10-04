package arrays.Task_1288;

import java.util.Arrays;
//https://leetcode.com/problems/remove-covered-intervals/
public class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int count = 0;
        Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0] == 0 ? o2[1] - o1[1] : o1[0] - o2[0]);
        int r = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][1] <= r) {
                count ++;
            } else {
                r = intervals[i][1];
            }
        }
        return intervals.length - count;
    }
}

/*
*
1 <= intervals.length <= 1000
intervals[i].length == 2
0 <= intervals[i][0] < intervals[i][1] <= 10^5
All the intervals are unique
*
*
Input: intervals = [[1,4],[3,6],[2,8]]
Output: 2
Explanation: Interval [3,6] is covered by [2,8], therefore it is removed.
*
* Сортируем левые концы интервалов по увеличению, а правые при равенстве левых концов - по убыванию.
* Это дает возможность смотреть - лежит ли правый конец следующего интервала внутри другого интервала.
* Если правый конец интервала A меньше правого конца интервала B - интервал A лежит внутри интервала B.
* Выбираем интервал - смотрим на след интервал,
* если он лежит внутри выбранного - получаем интервал, лежащий внутри.
* иначе - выбираем интервал, который не пересекается с выбранным, как новый выбранный.
* */