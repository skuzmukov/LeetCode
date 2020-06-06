package trees.Task_783;

import utils.TreeNode;
//https://leetcode.com/problems/minimum-distance-between-bst-nodes/
public class Solution {
    int i = 0;
    int[] arr = new int[100];
    int min = Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        inorder(root);
        System.out.println(i);
        for (int j = 1; j < i; j++) {
            min = Math.min(min, arr[j] - arr[j - 1]);
        }
        return min;
    }

    void inorder(TreeNode node) {
        if (node == null) { return; }
        inorder(node.left);
        arr[i++] = node.val;
        inorder(node.right);
    }
}