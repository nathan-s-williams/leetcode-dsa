public class SortLinkListWithAbsoluteVals {
    public ListNode sortLinkedList(ListNode head) {
        ListNode sortedListHead = new ListNode(head.val);
        ListNode sortedListTail = sortedListHead;
        head = head.next;
        while (head != null) {
            if (head.val <= sortedListHead.val) {
                sortedListHead = new ListNode(head.val, sortedListHead);
            } else {
                sortedListTail.next = new ListNode(head.val);
                sortedListTail = sortedListTail.next;
            }

            head = head.next;
        }
        return sortedListHead;
    }

    public static void main(String[] args) {
        SortLinkListWithAbsoluteVals solution = new SortLinkListWithAbsoluteVals();
//        int[] input = new int[]{0,2,-5,5,10,-10};
//        int[] input = new int[]{0,1,2};
        int[] input = new int[]{-1,-3,-7,-9};
        ListNode head = new ListNode();
        ListNode nodePointer = head;
        for (int i = 0; i < input.length; i++) {
            nodePointer.val = input[i];
            if (i != input.length - 1) {
                nodePointer.next = new ListNode();
                nodePointer = nodePointer.next;
            }
        }
        nodePointer = solution.sortLinkedList(head);
        while (nodePointer != null) {
            System.out.println(nodePointer.val);
            nodePointer = nodePointer.next;
        }
    }
}
