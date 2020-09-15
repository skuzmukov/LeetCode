package strings.Task_58;

class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int x = s.lastIndexOf(" ");
        if (x == -1) {
            return s.length();
        }
        return s.length() - x - 1;
    }
}
