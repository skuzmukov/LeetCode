package strings;

public class Task_696 {
    public int countBinarySubstrings(String s) {
        int zero = 0;
        int one = 0;
        int result = 0;
        int i = 0;
        while (i < s.length()) {
            while (i < s.length() && s.charAt(i) != '1') {
                i ++;
                zero ++;
            }
            result += Math.min(zero, one);
            one = 0;

            while (i < s.length() && s.charAt(i) != '0') {
                i ++;
                one ++;
            }
            result += Math.min(zero, one);
            zero = 0;
        }
        return result;
    }
}


/*
Input: "00110011"
Output: 6
Explanation: There are 6 substrings that have equal number of consecutive 1's and 0's: "0011", "01", "1100", "10", "0011", and "01".
*
* Считаем группы рядом стоящих нулей и единиц. За группу считаем подряд стоящие нули или единицы.
* Для каждых рядом стоящих групп - группу с наименьшим количеством добавляем в результат.
*/

