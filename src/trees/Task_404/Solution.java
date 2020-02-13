package trees.Task_404;

import utils.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {return 0;}
        Deque<TreeNode> stack = new ArrayDeque<TreeNode>();
        stack.push(root);
        int sum = 0;
        TreeNode temp;
        while(!stack.isEmpty()) {
            temp = stack.pop();
            if (temp.left != null) {
                if (temp.left.left == null && temp.left.right == null) {
                    sum += temp.left.val;
                }
                stack.push(temp.left);
            }
            if (temp.right != null) {
                stack.push(temp.right);
            }
        }

        return sum;
    }
}