package trees.Task_112;

import utils.TreeNode;

//https://leetcode.com/problems/path-sum/
public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        return sum(root, sum); // sum to zero
    }
    boolean sum (TreeNode node, int sum) {
        if (node == null) { return false; }
        if (node.left == null && node.right == null) { return sum - node.val == 0; }
        sum -= node.val;
        return sum(node.left, sum) || sum(node.right, sum);
    }
}