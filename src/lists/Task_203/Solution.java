package lists.Task_203;

import utils.ListNode;

public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode fake = new ListNode(-1);
        fake.next = head;
        ListNode current = fake;
        ListNode next = fake.next;
        while(current.next != null) {
            if (next.val == val) {
                    current.next = next.next;
                    next = current.next;
            } else {
                current = next;
                next = next.next;
            }
        }
        return fake.next;
    }
}