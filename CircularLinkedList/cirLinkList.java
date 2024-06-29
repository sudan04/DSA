class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class linkList {
    Node head;
    Node tail;

    void insertAtBegining(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }

        else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
        System.out.println(data + " is inserted at begining");
    }

    void insertAtLast(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        }

        else {
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }

        System.out.println(data + " is inserted at last");
    }

    void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        Node currentNode = head;

        int i = 1;
        while (i != position - 1) {
            currentNode = currentNode.next;
            i++;
        }

        newNode.next = currentNode.next;
        currentNode.next = newNode;

        System.out.println(data + " is inserted at position " + position);
    }

    void deleteAtFirst() {
        Node element = head;
        head = head.next;
        tail.next = head;
        System.out.println(element.data + " is deleted ");
    }

    void deleteAtLast() {
        Node element = tail;
        Node currentNode = head;

        while (currentNode.next != tail) {
            currentNode = currentNode.next;
        }

        currentNode.next = head;
        tail = currentNode;

        System.out.println(element.data + " is deleted");
    }

    void deleteAtPosition(int position) {
        Node element;
        Node currentNode = head;
        int i = 1;
        while (i != position - 1) {
            currentNode = currentNode.next;
            i++;
        }
        element = currentNode.next;
        currentNode.next = currentNode.next.next;

        System.out.println(element.data + " is deleted");
    }

    void display() {
        Node currentNode;
        currentNode = head;

        System.out.println("Linked List elements: ");
        do {
            System.out.printf("%d\t", currentNode.data);
            currentNode = currentNode.next;
        } while (currentNode != tail.next);
        System.out.println();
    }
}

public class cirLinkList {
    public static void main(String[] args) {
        linkList ll = new linkList();

        ll.insertAtBegining(8);
        ll.insertAtBegining(4);
        ll.display();

        ll.insertAtLast(5);
        ll.insertAtLast(90);

        ll.display();

        ll.insertAtPosition(89, 3);
        ll.insertAtPosition(80, 2);

        ll.display();
        ll.deleteAtFirst();
        ll.deleteAtFirst();
        ll.display();
        ll.deleteAtLast();
        ll.deleteAtPosition(3);
        ll.display();
    }
}