package strings;
//https://leetcode.com/problems/valid-palindrome-ii/
public class Task_680 {
    public boolean validPalindrome(String s) {
        int h = 0;
        int t = s.length() - 1;
        int mid = s.length() / 2;

        while (h < t) {
            if (s.charAt(h) == s.charAt(t)) {
                h ++;
                t --;
            } else {
                break;
            }
        }

        return isPalindrome(s, h + 1, t) || isPalindrome(s, h, t - 1);
    }

    private boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) { return false; }
            start ++;
            end --;
        }

        return true;
    }
}

/*
Input: "abca"
Output: True
Explanation: You could delete the character 'c'.
*
* Заводим 2 указателя на первый и последний символ строки
* Проходим по строке, пока не найдем два не равных друг другу символа
* тогда наша строка будет выглядеть так: {...}X...Y{...}, где в скобки заключены одинаковые части
* тогда строка будет палиндромом в одном из 2ух случаев
* {...}[X...]Y{...} или {...}X[...Y]{...}, т.е без первого неравного символа или без последнего.
*/
