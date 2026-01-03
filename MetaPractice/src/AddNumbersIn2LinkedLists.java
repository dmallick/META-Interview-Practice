import java.util.HashSet;

public class AddNumbersIn2LinkedLists {
    // List 1 having numbers: 2 3 5 7 
    // Goal: is to get 12

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public boolean findIndexOfNymber(ListNode l, int target){
        HashSet<Integer> set = new HashSet<>();
        ListNode current = l;
        int required;
        while (current != null) {
            
            required = target - current.val; //5 -> 7
            
            if ( set.contains(required)) {
                System.out.println("the current number is: " + current.val + " the required number is " + required);
                return true;
            } 
            set.add(current.val);
            current = current.next;
        }
        return false;

    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(7);
        l1.next.next.next = new ListNode(5);

        AddNumbersIn2LinkedLists addNum = new AddNumbersIn2LinkedLists();

        addNum.findIndexOfNymber(l1, 12);
    }


}
