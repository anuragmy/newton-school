import java.util.LinkedList;

public class test3 {

    public class Node {
        int data; // data
        Node next; // address

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public Node head = null;

    public void addNodeAtRight(int data) {
        Node node = new Node(data);
        if (head == null) {

            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    public void addNodeAtLeft(int data) {
        Node node = new Node(data);
        if (head == null) {
            // head.next = node; // 1 "saads" , true -> address
            head = node;
        } else {
            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = node;

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
        System.out.println("main");

        LinkedList ll = new LinkedList();

        ll.add(4);
        ll.add(2);
        ll.add(1);

        test3 t = new test3();
        t.addNodeAtLeft(1);
        t.addNodeAtLeft(2);
        t.addNodeAtLeft(3);
        t.addNodeAtLeft(4);

        // 4.3.2.1

        t.dsplay();

        t.addNodeAtLeft(5);

        t.dsplay();

        t.addNodeAtRight(6);

        t.dsplay();

    }

}
