public class Task_779 {
    public int kthGrammar(int N, int K) {
        return isKthEquals(0, N - 1, K - 1) ? 0 : 1;

    }

    private boolean isKthEquals(int val, int rowNum, int k) {
        if (rowNum == 0) {
            return val == 0;
        }

        if (k % 2 == 0) {
            val = val == 0 ? 0 : 1;
        } else {
            val = val == 0 ? 1 : 0;
        }
        return isKthEquals(val, rowNum - 1, k / 2);
    }
}

/*
*
* 0 -> 01
* 1 -> 10
Input: N = 1, K = 1
Output: 0

Input: N = 2, K = 1
Output: 0

Input: N = 2, K = 2
Output: 1

Input: N = 4, K = 5
Output: 1

Explanation:
row 1: 0
row 2: 01
row 3: 0110
row 4: 01101001
*
*Вернуть символ, стоящий на К месте в N строке. (индекс с 1)
*   каждый символ предыдущей строки переходит из позиции i в позиции 2i и 2i + 1
*   получается, мы можем по индексу i в текущей строке, предположить какое значение стояло в i / 2 позиции на пред строке
*   при условии четности/нечетности позиции к-ого символа.
*
*   Предполагаем, что на К месте в N месте стоит 0 - сохраним это значение в переменную.
*
*   Мы рекурсивно получаем значения элемента в позиции K / 2 по строке N - 1, из элементов на позициях K, K + 1 строки N по условию перехода и сохраняем значение в переменную
*   Таким образом, проходим по строкам от N до 1.
*   Сравниваем полученную переменную с 0 - числом в 1 позиции 1 строки.
*
*   Если значения равны - возвращаем предположенное в начале значение, иначе другое.
* */
