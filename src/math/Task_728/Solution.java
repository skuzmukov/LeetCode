package math.Task_728;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<Integer>();
        int temp;
        int curr;
        boolean isSelfDividing;
        for (int i = left; i <= right; i++) {
            isSelfDividing = true;
            curr = i;
            while (curr > 0) {
                temp = curr % 10;
                if (temp == 0 || i % temp != 0) {
                    isSelfDividing = false;
                    break;
                }
                curr /= 10;
            }
            if (isSelfDividing) {
                res.add(i);
            }
        }
        return res;
    }
}
