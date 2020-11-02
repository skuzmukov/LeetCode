package lists;

import utils.ListNode;

//https://leetcode.com/problems/insertion-sort-list/
public class Task_147 {
    public ListNode insertionSortList(ListNode head) {

        if (head == null) {
            return null;
        }

        ListNode dump = new ListNode(-1);
        dump.next = head;
        ListNode sorted = head;

        ListNode prev = null;
        ListNode curr = null;
        ListNode next = null;

        while (sorted.next != null) {
            if (sorted.val <= sorted.next.val) {
                sorted = sorted.next;
            } else {
                curr = sorted.next;
                sorted.next = curr.next;
                prev = dump;
                next = dump.next;

                while (curr.val > next.val) {
                    prev = next;
                    next = prev.next;
                }

                curr.next = next;
                prev.next = curr;
            }
        }

        return dump.next;
    }
}


/*
*
* Создаём фиктивную голову списка dump - след элементом делаем head
* Следующий за dump элемент называем sorted - cчитаем, что все элементы до него отсортированы
* Сравниваем значение sorted со значением след элемента - если sorted.val <= sorted.next.val - перебрасываем sorted = sorted.next
* Иначе, находим место куда вставить элемент до sorted,
*   а именно prev = dump, next = prev.next, curr - вставляемый элемент (sorted.next)
*   находим элемент next, для которого curr.val < next.val - вставляем элемент
*
* Возвращаем dump.next
* */