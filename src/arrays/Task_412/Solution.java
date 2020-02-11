package arrays.Task_412;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<String>(n);
        boolean isDividedByThree;
        boolean ifDividedByFive;
        for (int i = 1; i <= n; i++) {
            isDividedByThree = false;
            ifDividedByFive = false;
            isDividedByThree = i % 3 == 0;
            ifDividedByFive = i % 5 == 0;
            if (isDividedByThree && ifDividedByFive) {
                res.add("FizzBuzz");
            } else if (isDividedByThree) {
                res.add("Fizz");
            } else if (ifDividedByFive) {
                res.add("Buzz");
            } else {
                res.add(String.valueOf(i));
            }
        }
        return res;
    }
}