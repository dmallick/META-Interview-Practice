public class MergeTwoSortedLists {

    // ----- ListNode Class -----
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // ----- Merge Two Sorted Lists -----
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (list1 != null && list2 != null) {

            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // attach remaining nodes
        current.next = (list1 != null) ? list1 : list2;
        return dummy.next;
        
    }

    // ----- Helper: Print Linked List -----
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    // ----- MAIN METHOD TO TEST -----
    public static void main(String[] args) {

        // First sorted list: 1 -> 3 -> 5
        ListNode list1 = new ListNode(1,
                            new ListNode(3,
                                new ListNode(5)));

        // Second sorted list: 2 -> 4 -> 6
        ListNode list2 = new ListNode(2,
                            new ListNode(4,
                                new ListNode(6)));

        System.out.println("List 1:");
        printList(list1);

        System.out.println("List 2:");
        printList(list2);

        // Test merge
        ListNode merged = mergeTwoLists(list1, list2);

        System.out.println("Merged List:");
        printList(merged);
    }
}

