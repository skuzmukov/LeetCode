package lists.Task_2;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(-1);
        ListNode temp = res;
        int val = 0;
        while (l1 != null || l2 != null) {
            val += getValue(l1);
            val += getValue(l2);

            temp.next = new ListNode(val % 10);
            val /= 10;
            l1 = next(l1);
            l2 = next(l2);
            temp = temp.next;
        }
        if (val != 0) {
            temp.next = new ListNode(val);
        }
        return res.next;
    }

    int getValue(ListNode node) {
        return node == null ? 0 : node.val;
    }

    ListNode next(ListNode node) {
        return node == null ? null : node.next;
    }
}