package trees.Task_654;

import utils.TreeNode;

//https://leetcode.com/problems/maximum-binary-tree/
public class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(0, nums.length - 1, nums);
    }

    TreeNode construct(int h, int t, int[] nums) {
        if (h > t) { return null; }
        if (t == h) { return new TreeNode(nums[t]); }
        int ind = h;
        for (int i = h + 1; i <= t; i++) {
            if (nums[ind] < nums[i]) {
                ind = i;
            }
        }
        TreeNode node = new TreeNode(nums[ind]);
        node.left = construct(h, ind - 1, nums);
        node.right = construct(ind + 1, t, nums);

        return node;
    }
}