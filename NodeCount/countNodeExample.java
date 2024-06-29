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

    void insertNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        }

        else {
            newNode.next = head;
            head = newNode;
        }
        System.out.println(data + " is inserted");
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

    void deleteNode() {
        System.out.println(head.data + " is deeleted");
        head = head.next;
    }

    int nodeCount() {
        Node currentNode = head;
        int count = 0;
        while (currentNode != null) {
            count++;
            currentNode = currentNode.next;
        }
        return count;
    }

}

public class countNodeExample {
    public static void main(String[] args) {
        linkList list = new linkList();
        list.insertNode(56);
        list.insertNode(5);
        list.insertNode(6);
        list.insertNode(62);
        list.display();
        System.out.println("NodeCount: " + list.nodeCount());
        list.insertNode(100);
        list.display();
        System.out.println("NodeCount: " + list.nodeCount());
        list.deleteNode();
        list.display();
        System.out.println("NodeCount: " + list.nodeCount());

    }
}
