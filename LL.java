
public class LL {
    private Node head;
    private Node tail;
    private int size;

    LL() {
        head = null;
        tail = null;
        size = 0;

    }

    private class Node {
        int data;
        Node next;

        Node(int val) {
            this.data = val;
            this.next = null;

        }

        Node() {

        }
    }

    // Add element at the end
    public void add(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        tail = node;
        return;
    }

    // Function for add at the first
    public void addFirst(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        node.next = head;
        head = node;
        return;
    }

    // Function for delete first node
    public void deleteFirst() {
        head = head.next;
    }

    public void delete() {
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;

    }

    // Function for display
    public void display() {
        Node temp = new Node();
        temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();

    }

    public void reverseList() {
        // code here
        Node current = head;
        Node next;
        Node prev = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
    }

}
