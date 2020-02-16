package trees.Task_104;

import utils.TreeNode;

public class Solution {
    public int maxDepth(TreeNode root) {
        return maxTreeDepth(root);
    }

    public int maxTreeDepth(TreeNode node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + Math.max(maxTreeDepth(node.left), maxTreeDepth(node.right));
        }
    }
}