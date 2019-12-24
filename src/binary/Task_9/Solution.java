package binary.Task_9;

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {return false;}
        int expected = x;
        int reverse = 0;
        int temp = 0;
        while(x > 0) {
            temp = x % 10;
            reverse = reverse * 10 + temp;
            x /= 10;
        }
        return expected == reverse;
    }
}
