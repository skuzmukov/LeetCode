package bytes.Task_1009;

//https://leetcode.com/problems/complement-of-base-10-integer/
public class Solution {
    public int bitwiseComplement(int N) {
        if (N == 0) { return 1; }
        int val = Integer.highestOneBit(N)* 2 - 1;
        return val - N;
    }
}

/*
*
Input: 5
Output: 2
Explanation: 5 is "101" in binary, with complement "010" in binary, which is 2 in base-10.
*
*   В подсказке написано, дополнение числа образует число 11..11..11 - нечетное число, 2 ^ (позиция старшего бита в N + 1) - 1
*   Если найти это число и вычесть из него N - получится результат
*
* */