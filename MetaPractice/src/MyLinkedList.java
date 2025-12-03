public class MyLinkedList {
    

    // Node structure
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;   // first node
    private int size;    // optional, keeps track of length

    // Add element at the end
    public void add(int value) {
        Node newNode = new Node(value);

        if (head == null) {    // list is empty
            head = newNode;
            size++;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        size++;
    }

    // Add at beginning
    public void addFirst(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // Insert at specific index
    public void addAt(int index, int value) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException();

        if (index == 0) {
            addFirst(value);
            return;
        }

        Node newNode = new Node(value);
        Node current = head;

        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
        size++;
    }

    // Remove first occurrence of a value
    public boolean remove(int value) {
        if (head == null) return false;

        if (head.data == value) {   // remove head
            head = head.next;
            size--;
            return true;
        }

        Node current = head;
        while (current.next != null && current.next.data != value) {
            current = current.next;
        }

        if (current.next == null) return false; // not found

        current.next = current.next.next;
        size--;
        return true;
    }

    // Search element
    public boolean contains(int value) {
        Node current = head;

        while (current != null) {
            if (current.data == value) return true;
            current = current.next;
        }
        return false;
    }

    // Get size
    public int size() {
        return size;
    }

    // Print List
    public void printList() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main for testing
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.add(10);
        list.add(20);
        list.add(30);

        list.addFirst(5);
        list.addAt(2, 15);

        list.printList();  // 5 -> 10 -> 15 -> 20 -> 30 -> null
        System.out.println("Contains 20? " + list.contains(20));
        list.remove(15);
        list.printList();  // 5 -> 10 -> 20 -> 30 -> null
    }

}
