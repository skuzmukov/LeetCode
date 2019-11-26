package arrays.Task_217;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : nums) {
            min = Math.min(i, min);
            max = Math.max(i, max);
        }
        int index;
        int[] arr = new int[max - min + 1];
        for(int i : nums) {
            index = i - min;
            arr[index] += 1;
            if (arr[index] > 1) {
                return true;
            }
        }
        return false;
    }
}