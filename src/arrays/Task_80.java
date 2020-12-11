package arrays;


//https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
public class Task_80 {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) { return nums.length; }

        int len = nums.length;
        int val = Integer.MAX_VALUE;
        int i = 0;
        int index = 0;
        int count = 0;

        while (i < len) {
            if (nums[i] != val) {
                val = nums[i];
                nums[index++] = nums[i++];
                count ++;
            } else {
                count ++;
                nums[index++] = nums[i];
                while (i < len && val == nums[i]) {
                    i++;
                }
            }
        }

        return count;
    }
}