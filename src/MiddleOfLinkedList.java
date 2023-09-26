public class MiddleOfLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        if (fast.next == null) {
            return slow;
        } else {
            return slow.next;
        }
    }

    public static void main(String[] args) {
        MiddleOfLinkedList solution = new MiddleOfLinkedList();
        int[] input = {1, 2, 3, 4, 5, 6};
        ListNode head = new ListNode(input[0]);
        ListNode listPointer = head;
        for (int i = 1; i < input.length; i++) {
            listPointer.next = new ListNode(input[i]);
            listPointer = listPointer.next;
        }

        System.out.println((solution.middleNode(head)).val);
    }
}
