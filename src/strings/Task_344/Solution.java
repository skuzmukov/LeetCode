package strings.Task_344;

class Solution {
    public void reverseString(char[] s) {
        reverse(0, s.length - 1, s);
    }

    void reverse(int i, int j, char[] s) {
        if (i >= j) {
            return;
        }
        char c = s[i];
        s[i] = s[j];
        s[j] = c;
        reverse(i + 1, j - 1, s);
    }
    /*
    public void reverseString(char[] s) {
        char temp;
        for (int i = 0, j = s.length - 1; i < j; i++, j--) {
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
     */
}