package strings.Task_848;

public class Solution {
    public String shiftingLetters(String S, int[] shifts) {
        if (shifts.length == 0) {
            return S;
        }
        int count = 0;
        for (int i = shifts.length - 1; i >= 0; i--) {
            count += shifts[i] % 26;
            shifts[i] = count % 26;
        }
        StringBuilder res = new StringBuilder();
        int a = (int) 'a';
        int val = 0;
        for (int i = 0; i < S.length(); i++) {
            val = (S.charAt(i) - a + shifts[i]) % 26;
            res.append((char)(val + a));
        }
        return res.toString();
    }
}
