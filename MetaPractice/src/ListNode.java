public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }


      public ListNode reverseListNode(ListNode head){
        // 1 2 3 4 5
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {           // current =1
            ListNode nexNode = current.next;
            
            current.next = prev; //actual reversing
            prev = current; // mov prev to curr
            current = nexNode; // mov cur to next
        }
        return prev;
      }



          public static void main(String[] args) {
        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode sol = new ListNode();
        ListNode reversed = sol.reverseListNode(head);

        printList(reversed);
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
  }
