
public class DoublyLinkedList {

    public class Node {
        int data; // data
        Node next; // address
        Node prev; // address of prev node

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }

    public Node head = null;
    public Node tail = null;

    public void addNodeAtRight(int data) {
        Node node = new Node(data);
        if (head == null && tail == null) {

            head = node;
            tail = node;
        } else {
            node.prev = tail;
            tail.next = node;
            tail = node;

        }
    }

    public void dsplay() {
        int len = 0;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {

            System.out.println(temp.data + " ");
            len++;
            temp = temp.next;

        }
        System.out.println("length is: " + len);
        System.out.println("-----------------");

    }

    public static void main(String[] args) {

        DoublyLinkedList t = new DoublyLinkedList();
        t.addNodeAtRight(1);
        t.addNodeAtRight(2);
        t.addNodeAtRight(3);
        t.addNodeAtRight(4);
        t.addNodeAtRight(5);
        t.addNodeAtRight(6);
        // t.makeCycle();

        // 1->2->3->4->5->6---
        // ^------|
        t.dsplay();

        // t.addNodeAtLeft(5);

        // t.dsplay();

        // t.addNodeAtRight(6);

        // t.dsplay();

    }

}