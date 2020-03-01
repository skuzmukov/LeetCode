package arrays.Task_884;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        String[] splittedA = A.split(" ");
        String[] splittedB = B.split(" ");

        Map<String, Integer> map = new HashMap<String, Integer>();

        for (String s : splittedA) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for (String s : splittedB) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        List<String> res = new ArrayList<String>();

        for (Map.Entry<String, Integer> s : map.entrySet()) {
            if (s.getValue() == 1) {
                res.add(s.getKey());
            }
        }

        String[] arr = new String[res.size()];

        return res.toArray(arr);

    }
}