package trees.Task_538;

import utils.TreeNode;

//https://leetcode.com/problems/convert-bst-to-greater-tree/
public class Solution {
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        postOrder(root);
        return root;
    }

    void postOrder(TreeNode node) {
        if (node == null) { return; }
        postOrder(node.right);
        sum += node.val;
        node.val = sum;
        postOrder(node.left);
    }
}