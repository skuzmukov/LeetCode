package trees.Task_700;

import utils.TreeNode;

public class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        return search(root, val);
    }

    TreeNode search(TreeNode node, int val) {
        if (node == null || node.val == val) {
            return node;
        }
        if (node.val < val) {
            return search(node.right, val);
        } else {
            return search(node.left, val);
        }
    }
}