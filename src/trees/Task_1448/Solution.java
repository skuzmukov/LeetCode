package trees.Task_1448;

import utils.TreeNode;
//https://leetcode.com/problems/count-good-nodes-in-binary-tree/submissions/
class Solution {
    public int goodNodes(TreeNode root) {
        return goodNode(root, -10000);
    }

    private int goodNode(TreeNode node, int max) {
        if (node == null) {
            return 0;
        }
        int count = 0;
        if (node.val >= max) {
            count ++;
            max = node.val;
        }
        count += goodNode(node.left, max);
        count += goodNode(node.right, max);

        return count;
    }
}