package math;
//https://leetcode.com/problems/excel-sheet-column-title/
public class Task_168 {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        char c;
        while (n > 0) {
            c = (char) ('A' + (--n % 26));
            sb.append(c);
            n /= 26;
        }

        return sb.reverse().toString();
    }
}

/**/