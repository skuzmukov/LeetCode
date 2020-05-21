package strings.Task_811;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//https://leetcode.com/problems/subdomain-visit-count/
public class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        int count;
        int i;
        int t;
        String curr;
        for (String domain : cpdomains) {
            i = 0;
            while (domain.charAt(i) != ' ') { i ++; }
            count = Integer.parseInt(domain.substring(0, i));
            curr = domain.substring(i + 1);
            map.put(curr, count + map.getOrDefault(curr, 0));
            while (i < domain.length()) {
                if (domain.charAt(i) == '.') {
                    curr = domain.substring(i + 1);
                    map.put(curr, count + map.getOrDefault(curr, 0));
                }
                i ++;
            }
        }
        List<String> res = new ArrayList<>(map.size());
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            res.add(entry.getValue() + " " + entry.getKey());
        }
        return res;
    }
}