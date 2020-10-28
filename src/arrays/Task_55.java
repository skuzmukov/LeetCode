package arrays;

//https://leetcode.com/problems/jump-game/
public class Task_55  {
    public boolean canJump(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (max >= i) {
                max = Math.max(max, i + nums[i]);
            }
        }
        return max >= nums.length - 1;
    }
}


/*
*
* Динамическое программирование
* 
* 
* */