package strings;

import java.util.HashSet;
import java.util.Set;

public class Task_1461 {
    public boolean hasAllCodes(String s, int k) {
        int length = s.length();

        if (k > length) { return false; }

        Set<Integer> set = new HashSet<>(length - k + 1);
        int curr = 0;

        for (int i = 0; i < k; i++) {
            curr |= (s.charAt(i) - '0');
            curr <<= 1;
        }
        curr >>>= 1;
        set.add(curr);

        for (int i = 0; i < length - k; i++) {
            curr = curr << 1;
            curr -= s.charAt(i) - '0' << k;
            curr |= (s.charAt(i + k) - '0');
            set.add(curr);

        }
        int max = (int) Math.pow(2, k);
        return set.size() == max;
    }
}

/*
*
* 
*
* */