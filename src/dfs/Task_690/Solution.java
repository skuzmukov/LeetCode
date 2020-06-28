package dfs.Task_690;

import java.util.*;

class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
}

public class Solution {
    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Integer> map = new HashMap<>(employees.size());
        Map<Integer, List<Integer>> mapSub = new HashMap<>(employees.size());
        for (Employee emp : employees) {
            mapSub.put(emp.id, emp.subordinates);
            map.put(emp.id, emp.importance);
        }
        int res = 0;

        Queue<Integer> list = new LinkedList<>();
        Integer curr;
        list.add(id);
        while (!list.isEmpty()) {
            curr = list.poll();
            res += map.get(curr);
            list.addAll(mapSub.get(curr));
        }
        return res;
    }
}