package trees.Task_938;

import utils.TreeNode;
import java.util.Stack;

class Solution {
    public int rangeSumBST(TreeNode root, int L, int R) {
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        int res = 0;
        TreeNode temp;
        boolean isMoreThenL;
        boolean isLessThenR;
        boolean isExistLeft;
        boolean isExistRight;
        while (!stack.empty()) {
            temp = stack.pop();
            isMoreThenL = L <= temp.val;
            isLessThenR = temp.val <= R;
            isExistLeft = temp.left != null;
            isExistRight = temp.right != null;
            if (isMoreThenL && isLessThenR) {
                res += temp.val;
                if (isExistRight) {stack.add(temp.right);}
                if (isExistLeft) {stack.add(temp.left);}
            }
            else if (!isMoreThenL && isExistRight) {stack.add(temp.right);}
            else if (!isLessThenR && isExistLeft) {stack.add(temp.left);}
        }
        return res;
    }
}