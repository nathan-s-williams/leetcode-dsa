public class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        //Return single node list
        if (head.next == null || left == right) {
            return head;
        }
        //For multiple node lists
        ListNode output = head;
        int count = 1;
        ListNode prev = null, nodeBeforeSublist = null, sublistStart = null, sublistEnd = null, nodeAfterSublist = null;
        //Reverse sublist
        while (head != null) {
            if (count >= left && count <= right) {
                if (count == left) {
                    nodeBeforeSublist = prev;
                    sublistStart = head;
                }

                if (count == right) {
                    sublistEnd = head;
                    nodeAfterSublist = head.next;
                }

                ListNode nextNode = head.next;
                head.next = prev;
                prev = head;
                head = nextNode;
            } else {
                prev = head;
                head = head.next;
            }

            count++;
        }

        //Flip sublist so as end is at start and start is at end
        if (nodeBeforeSublist == null && nodeAfterSublist == null) {
            output = sublistEnd;
        } else if (nodeBeforeSublist == null) {
            sublistStart.next = nodeAfterSublist;
            output = sublistEnd;
        } else if (nodeAfterSublist == null) {
            nodeBeforeSublist.next = sublistEnd;
            sublistStart.next = null;
        } else {
            nodeBeforeSublist.next = sublistEnd;
            sublistStart.next = nodeAfterSublist;
        }

        return output;
    }

    public static void main(String[] args) {
        ReverseLinkedListII solution = new ReverseLinkedListII();
        int[] input = {1, 2, 3, 4, 5};
//        int[] input = {5, 6, 7};
        ListNode head = new ListNode(input[0]);
        ListNode listPointer = head;
        for (int i = 1; i < input.length; i++) {
            listPointer.next = new ListNode(input[i]);
            listPointer = listPointer.next;
        }

        int left = 2;
        int right = 4;
        ListNode output = solution.reverseBetween(head, left, right);

        while (output != null) {
            System.out.println(output.val);
            output = output.next;
        }
    }
}
