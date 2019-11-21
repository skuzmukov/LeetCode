package binary.Task_118;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if (numRows == 0) {
            return res;
        }
        ArrayList<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        res.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            row.add(1);
            for (int index = 1; index < i; index++) {
                row.add(res.get(i - 1).get(index - 1) + res.get(i - 1).get(index));
            }
            row.add(1);
            res.add(row);
        }
        return res;
    }
}