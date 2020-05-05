package strings.Task_1436;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
//https://leetcode.com/problems/destination-city/
public class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> src = new HashSet<String>(paths.size());
        for (List<String> path : paths) {
            src.add(path.get(0));
        }
        for (List<String> path : paths) {
            if (!src.contains(path.get(1))) {
                return path.get(1);
            }
        }
        return null;
    }
}