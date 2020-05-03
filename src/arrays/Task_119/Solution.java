package arrays.Task_119;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/pascals-triangle-ii/
public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List list = new ArrayList<>();
        list.add(1);
        return triangle(rowIndex, 0, list);
    }

    List<Integer> triangle(int val, int index, List<Integer> row) {
        if (index == val) { return row; }
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        for (int i = 1; i < row.size(); i++) {
            list.add(row.get(i - 1) + row.get(i));
        }
        list.add(1);
        return triangle(val, ++index, list);
    }
}