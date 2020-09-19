package backtracking.Task_1291;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//https://leetcode.com/problems/sequential-digits/
public class Solution {

    List<Integer> seq = new ArrayList<>(100);

    public List<Integer> sequentialDigits(int low, int high) {

        processSequences(high);
        List<Integer> result = new ArrayList<Integer>();
        for(Integer i : seq) {
            if (low <= i && i <= high) {
                result.add(i);
            }
        }
        Collections.sort(result);
        return result;

    }

    private void processSequences(int limit) {
        for (int i = 1; i < 10; i++) {
            generateNextSequenceMoreThan(i, limit);
        }
    }

    private void generateNextSequenceMoreThan(int x, int limit) {
        if (x > limit) { return; }
        seq.add(x);
        int lastDigit = x % 10;
        if (lastDigit + 1 < 10) {
            generateNextSequenceMoreThan(x * 10 + lastDigit + 1, limit);
        }
    }
}