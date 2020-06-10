package arrays.Task_599;

import java.util.*;

//https://leetcode.com/problems/minimum-index-sum-of-two-lists/
public class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map1 = new HashMap<>(list1.length);

        for (int i = 0; i < list1.length; i++) {
            map1.put(list1[i], i);
        }
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < list2.length; i++) {
            if (map1.containsKey(list2[i])) {
                map.put(list2[i], map1.get(list2[i]) + i);
            }
        }

        PriorityQueue<String> queue = new PriorityQueue<>(Comparator.comparingInt(map::get));
        queue.addAll(map.keySet());

        List<String> res = new ArrayList<>();

        int v = map.get(queue.peek());

        while (!queue.isEmpty() && map.get(queue.peek()) == v) {
            res.add(queue.poll());
        }


        return res.toArray(new String[0]);
    }
}