package strings.Task_28;

public class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) { return 0; }
        if (haystack.length() < needle.length()) { return -1; }
        int st = 0;
        char f = needle.charAt(st);
        st = haystack.indexOf(f, st);
        while (st != -1 && st + needle.length() <= haystack.length()) {
            int i;
            for (i = 1; i < needle.length(); i++) {
                if (haystack.charAt(st + i) != needle.charAt(i)) {
                    i = -1;
                    break;
                }
            }
            if (i == needle.length()) {
                return st;
            } else {
                st = haystack.indexOf(f, st + 1);
            }
        }
        return -1;
    }
}