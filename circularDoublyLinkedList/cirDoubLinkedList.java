class Node {
    int data;
    Node prev, next;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev= null;
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
            head.prev = newNode;
            tail.next = newNode;
        }

        else {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            head = newNode;
        }
        System.out.println(data + " inserted at begining");
    }

    void insertAtLast(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
            head.prev = newNode;
            tail.next = newNode;
        }

        else {
            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = head;
            head.prev = newNode;
            tail = newNode;
        }

        System.out.println(data + " inserted at last");
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
        currentNode.next.prev = newNode;
        currentNode.next = newNode;
        newNode.prev = currentNode;

        System.out.println(data + " inserted at position " + position);

    }

    void deleteAtFirst() {
        Node element = head;
        head = head.next;
        tail.next = head;
        head.prev = tail;
        System.out.println(element.data + " deleted ");
    }

    void deleteAtLast() {
        Node element = tail;
        Node currentNode = head;

        while (currentNode.next != tail) {
            currentNode = currentNode.next;
        }

        currentNode.next = head;
        tail = currentNode;
        head.prev = tail;

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
        currentNode.next.prev = currentNode;

        System.out.println(element.data + " is deleted");
    }

    void display() {
        Node currentNode;
        currentNode = head;

        System.out.println("Elements are: ");
        do {
            System.out.printf("%d\t", currentNode.data);
            currentNode = currentNode.next;
        } while (currentNode != tail.next);
        System.out.println();
    }
}

public class cirDoubLinkedList {
    public static void main(String[] args) {
        linkList list = new linkList();

        list.insertAtBegining(8);
        list.insertAtBegining(4);
        list.insertAtLast(5);
        list.insertAtLast(90);
        list.insertAtPosition(80, 2);
        list.display();
        list.deleteAtFirst();
        list.deleteAtLast();
        list.deleteAtPosition(3);
        list.display();
    }
}
