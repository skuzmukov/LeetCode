package lists;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
public class Task_116  {
    public Node connect(Node root) {
        if (root == null || root.left == null) { return root; }
        Queue<Node> queue = new LinkedList<>();
        int counter = 2;
        queue.add(root.left);
        queue.add(root.right);
        int i;
        Node temp;
        while (!queue.isEmpty()) {
            i = 1;
            while (!queue.isEmpty() && i < counter) {
                temp = queue.poll();
                temp.next = queue.peek();

                if (temp.left != null) {
                    queue.add(temp.left);
                    queue.add(temp.right);
                }
                i++;
            }
            temp = queue.poll();
            if (temp != null && temp.left != null) {
                queue.add(temp.left);
                queue.add(temp.right);
            }
            counter *= 2;
        }
        return root;
    }
}


//Упростить!


class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}