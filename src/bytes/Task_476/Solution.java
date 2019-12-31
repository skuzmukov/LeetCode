package bytes.Task_476;

class Solution {
    public int findComplement(int num) {
        int numberOfLeadingZeros = Integer.numberOfLeadingZeros(num);
        int shifted = num << numberOfLeadingZeros;
        return ~shifted >> numberOfLeadingZeros;
    }
}