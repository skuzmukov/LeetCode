package trees.Task_589;

import utils.Node;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        return preorder(root, list);
    }
    List<Integer> preorder(Node root, List<Integer> list) {
        if (root == null) { return list; }
        list.add(root.val);
        for (Node n : root.children) {
            list = preorder(n, list);
        }
        return list;
    }
}