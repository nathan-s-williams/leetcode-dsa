public class DuplicatesInLinkedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode right = head;
        ListNode left = head;

        while (right != null) {
            while (right.next != null && right.next.val == left.val) {
                right = right.next;
            }

            if (right != left) {
                right = right.next;
                left.next = right;
                left = right;
            } else {
                right = right.next;
                left = right;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        DuplicatesInLinkedList solution = new DuplicatesInLinkedList();
//        int[] input = {1, 2, 3, 3, 3};
        int[] input = {1, 1, 2, 2, 2, 3,};
        ListNode head = new ListNode(input[0]);
        ListNode listPointer = head;
        for (int i = 1; i < input.length; i++) {
            listPointer.next = new ListNode(input[i]);
            listPointer = listPointer.next;
        }

        ListNode output = solution.deleteDuplicates(head);
        while (output != null) {
            System.out.println(output.val);
            output = output.next;
        }
    }
}
