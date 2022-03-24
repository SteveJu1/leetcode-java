import Structure.ListNode;

public class P_24 {
    /*
    recursion
     */
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode newHead = head.next;
        head.next = swapPairs(head.next.next);
        newHead.next = head;

        return newHead;
    }

    /*
    Iteration
     */
    public ListNode swapPairs1(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode cur = head;
        ListNode newHead = head.next;

        while (cur != null && cur.next != null) {


        }
        return newHead;
    }

}
