package trees.Task_108;

import utils.TreeNode;

public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return toTree(0, nums.length - 1, nums);
    }

    private TreeNode toTree(int i, int j, int[] nums) {
        if (i > j) { return null; }
        if (i == j) { return new TreeNode(nums[i]); }
        int m = (i + j) / 2;
        TreeNode root = new TreeNode(nums[m]);
        root.left = toTree(i, m - 1, nums);
        root.right = toTree(m + 1, j, nums);
        return root;
    }
}