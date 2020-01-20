package lists.Task_1290;

import utils.ListNode;

public class Solution {
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            count ++;
            temp = temp.next;
        }
        count --;
        temp = head;
        int x = (int) Math.pow(2, count);
        int res = 0;
        while (temp != null) {
            res += temp.val * x;
            x >>= 1;
            temp = temp.next;
        }

        return res;
    }
}
