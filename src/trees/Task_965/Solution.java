package trees.Task_965;

import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public boolean isUnivalTree(TreeNode root) {
        if (root == null) {return  false;}
        int expected = root.val;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode temp;
        while (!stack.empty()) {
            temp = stack.pop();
            if (temp.val != expected) {return false;}
            if (temp.left != null) {stack.push(temp.left);}
            if (temp.right != null) {stack.push(temp.right);}
        }
        return true;
    }
}