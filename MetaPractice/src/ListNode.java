public class ListNode {
  int val;
  ListNode next;

  ListNode() {
  }

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  // Reverse a linkedList
  public ListNode reverseListNode(ListNode head) {
    // 1 2 3 4 5
    ListNode prev = null;
    ListNode current = head;

    while (current != null) { // current =1
      ListNode nexNode = current.next;

      current.next = prev; // actual reversing
      prev = current; // mov prev to curr
      current = nexNode; // mov cur to next
    }
    return prev;
  }

  // Finding Middle of LinkedList
  public ListNode findMiddle(ListNode head) {
    ListNode fast = head;
    ListNode slow = head;

    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
    }
    return slow;
  }

  // Finding the CYcle
public boolean hasCycle(ListNode head) {
      if (head == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;         // move 1 step
            fast = fast.next.next;    // move 2 steps

            if (slow == fast) {       // pointers meet → cycle exists
                return true;
            }
        }

      return false;  // fast reached null → no cycle
    }

public ListNode findStartOfCycle(ListNode head){

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;         // move 1 step
            fast = fast.next.next;    // move 2 steps

            if (slow == fast) {       // pointers meet → cycle exists
                break;
            }
        }

        slow = head;
        while (fast != slow) {
          slow = slow.next;
          fast = fast.next;
        }

      return slow;  // fast reached null → no cycle
}    

  public static void main(String[] args) {
    // Create linked list: 1 -> 2 -> 3 -> 4 -> 5
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    
    //uncomment it to test the cycle
    // Make 5 → 3 (cycle starts at node with value 3)
    head.next.next.next.next.next = head.next.next;
    
    
    ListNode sol = new ListNode();

    // uncomment below for testing reversal
    // ListNode reversed = sol.reverseListNode(head);
    // printList(reversed);

    // uncomment below for testing the middle of LL
    //ListNode middle = sol.findMiddle(head);
    //System.out.println(middle.val);


    //uncomment below for testing if List has a  Cycle
     //System.out.println(sol.hasCycle(head));


     //uncomment below for testing if List has a  Cycle
     System.out.println(sol.findStartOfCycle(head).val);

  }

  public static void printList(ListNode head) {
    while (head != null) {
      System.out.print(head.val + " ");
      head = head.next;
    }
  }
}
