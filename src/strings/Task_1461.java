package strings;

import java.util.HashSet;
import java.util.Set;

public class Task_1461 {
    public boolean hasAllCodes(String s, int k) {
        int length = s.length();

        if (k > length) { return false; }

        Set<Integer> set = new HashSet<>(length - k + 1);

        int curr;
        int c;
        int count;

        for (int i = 0; i < length - k + 1; i++) {
            count = 0;
            curr = 0;
            c = i;
            while(count < k) {
                if (s.charAt(c++) == '1') {
                    curr += (int) Math.pow(2, k - count);
                }
                count ++;
            }
            set.add(curr);

        }

        int max = (int) Math.pow(2, k);

        return set.size() == max;
    }
}


/*
*
* заменить кусок О(М * К) на sliding window
*
* */