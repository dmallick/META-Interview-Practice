public class IntersectionTwoLinked {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public ListNode findIntersection(ListNode l1, ListNode l2){

        ListNode p1 = l1;
        ListNode p2 = l2;

        while (p1 != p2) {
            if (p1 != null) {
                p1 = p1.next;
            }else{
                p1 = l2;
            }

            if (p2 != null) {
                p2 = p2.next;
            }else{
                p2 = l1;
            }
        }
        return p1;
    }


    public static void main(String[] args) {
        
        ListNode common = new ListNode(2);
        common.next = new ListNode(6);
        
        ListNode list1 = new ListNode(1);
        list1.next = common;


        ListNode list2 = new ListNode(5);
        list2.next = common;

        IntersectionTwoLinked itl = new IntersectionTwoLinked();
        ListNode intersected = itl.findIntersection(list1, list2);

        System.out.println(intersected.val);    
        //printList(intersected);
        
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}
