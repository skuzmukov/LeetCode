package trees.Task_226;

import utils.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) { return null; }
        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.push(root);
        TreeNode temp;
        TreeNode current;
        while (!stack.isEmpty()) {
            current = stack.pop();
            temp = current.left;
            current.left = current.right;
            current.right = temp;
            if (current.left != null) { stack.push(current.left); }
            if (current.right != null) { stack.push(current.right); }
        }
        return root;
    }
}