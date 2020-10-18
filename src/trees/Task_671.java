package trees;

import utils.TreeNode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//https://leetcode.com/problems/second-minimum-node-in-a-binary-tree/
public class Task_671 {
    private final List<Integer> list = new LinkedList<>();

    public int findSecondMinimumValue(TreeNode root) {
        traverse(root);

        if (list.size() == 0) { return -1; }
        Collections.sort(list);
        int min = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (min != list.get(i)) {
                return list.get(i);
            }
        }
        return -1;
    }

    private void traverse(TreeNode node) {
        if (node == null) { return; }
        traverse(node.left);
        list.add(node.val);
        traverse(node.right);
    }
}


/*
*
* Сделал обход дерева.
* Не воспользовался условием, что root.val == min(root.left.val, root.right.val) for each internal node of the tree.
*
* 
* */