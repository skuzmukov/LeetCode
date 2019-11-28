package stacks.Task_71;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public String simplifyPath(String path) {
        StringBuilder part = new StringBuilder();
        Deque<String> res = new ArrayDeque<>();
        String cat;
        int i = 0;
        while (i < path.length()) {
            while (i < path.length() && path.charAt(i) == '/') {
                i++;
            }
            while (i < path.length() && path.charAt(i) != '/') {
                part.append(path.charAt(i++));
            }
            cat = part.toString();
            part.setLength(0);
            if ("..".equals(cat) && res.size() > 0) {
                    res.pollLast();
            } else if (!cat.isEmpty() && !".".equals(cat) && !"..".equals(cat)) {
                res.add(cat);
            }
        }
        part.append('/');
        if (res.size() > 0) {
            while (res.size() > 1) {
                part.append(res.remove()).append('/');
            }
            part.append(res.remove());
        }
        return part.toString();
    }
}