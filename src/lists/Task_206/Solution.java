package lists.Task_206;

import utils.ListNode;

public class Solution {
    public ListNode reverseList(ListNode head) {
        return reverse(null, head);
    }

    ListNode reverse (ListNode prev, ListNode next) {
        if (next == null) { return  prev; }
        ListNode nextNext = next.next;
        next.next = prev;
        return reverse(next, nextNext);
    }
}