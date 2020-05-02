package lists.Task_24;

import utils.ListNode;

public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null) { return null; }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode node, prev, next, nextNext;
        node = dummy;
        while (node.next != null && node.next.next != null) {
            prev = node.next;
            next = prev.next;
            nextNext = next.next;

            node.next = next;
            next.next = prev;
            prev.next = nextNext;

            node = node.next.next;
        }
        return dummy.next;
    }
}