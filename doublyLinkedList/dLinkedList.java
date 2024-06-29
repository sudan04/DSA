
class Node {
    int data;
    Node next, prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class linkList {
    Node head;

    public linkList() {
        this.head = null;
    }

    void insertAtBegining(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        }

        else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
        System.out.println(newNode.data + " is inserted at begining");
    }

    void insertAtLast(int data) {

        Node newNode = new Node(data);
        Node currentNode = head;

        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        System.out.println(data+ " is inserted");
        currentNode.next = newNode;
        newNode.prev = currentNode;

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
        if (currentNode.next != null) {
            currentNode.next.prev = newNode;
        }
        System.out.println(data+ " is inserted");
        currentNode.next = newNode;
        newNode.prev = currentNode;

    }

    void deleteAtPosition(int position) {

        Node currentNode = head;
        int i = 1;
        while (i != position - 1) {
            currentNode = currentNode.next;
            i++;
        }
        System.out.println(currentNode.next.data+" is deleted");
        currentNode.next = currentNode.next.next;
        currentNode.next.prev = currentNode;
    }

    void deleteAtFirst() {
        int data= head.data;
        head = head.next;
        head.prev = null;
        System.out.println(data+" is deleted");
    }

    void deleteAtLast() {
       
        Node currentNode = head;
        while (currentNode.next.next != null) {
            currentNode = currentNode.next;
        }
        System.out.println(currentNode.next.data+ " is deleted");
        currentNode.next = null;
    }

    void display() {
        Node currentNode;
        currentNode = head;

        System.out.println("Doubly Linkedlist elements: ");
        while (currentNode != null) {
            System.out.printf("%d\t", currentNode.data);
            currentNode = currentNode.next;
        }
        System.out.println();
    }
}

public class dLinkedList {
    public static void main(String[] args) {
        linkList list = new linkList();

        list.insertAtBegining(23);
        list.insertAtBegining(45);

        list.insertAtLast(65);
        list.insertAtLast(56);
        list.insertAtPosition(12, 2);
        list.display();
        list.deleteAtFirst();
        list.deleteAtPosition(3);
        list.deleteAtLast();
        list.display();

    }
}