
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

    public linkList() {
        this.head = null;
    }

    void insertAtBegining(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        else {
            newNode.next = head;
            head = newNode;
        }
        System.out.println(data + " is inserted at beginning");
    }

    void insertAtLast(int data) {

        Node newNode = new Node(data);
        Node currentNode = head;

        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;
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

    void deleteAtPosition(int position) {

        Node currentNode = head;
        int i = 1;
        while (i != position - 1) {
            currentNode = currentNode.next;
            i++;
        }
        System.out.println(currentNode.next.data + " is deleted");
        currentNode.next = currentNode.next.next;
    }

    void deleteAtFirst() {
        System.out.println(head.data + " is deeleted");
        head = head.next;
    }

    void deleteAtLast() {
        Node currentNode = head;
        while (currentNode.next.next != null) {
            currentNode = currentNode.next;
        }
        System.out.println(currentNode.next.data + " is deleted");
        currentNode.next = null;
    }

   

    void display() {
        Node currentNode;
        currentNode = head;

        System.out.println("Linked List: ");
        while (currentNode != null) {
            System.out.printf("%d\t", currentNode.data);
            currentNode = currentNode.next;
        }
        System.out.println();
    }
}

public class nodeExample2 {
    public static void main(String[] args) {
        linkList ll = new linkList();

        ll.insertAtBegining(23);
        ll.insertAtBegining(45);

        ll.insertAtLast(65);
        ll.insertAtLast(56);
        ll.insertAtPosition(12, 2);
        ll.display();
        ll.deleteAtFirst();
        ll.deleteAtFirst();
        ll.deleteAtPosition(3);
        ll.deleteAtLast();
        ll.display();

    }
}