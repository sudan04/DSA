class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node front, rear;

    LinkedList() {
        front = null;
        rear = null;
    }

    boolean isEmpty() {
        return front == null;
    }

    void inQueue(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            front = rear = newNode;

        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println(newNode.data + " is enQueued");
    }

    void deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        }

        else {
            int data = front.data;
            front = front.next;
            System.out.println(data + " is deQueued");
        }
    }

    void display() {
        Node current = front;
        System.out.println("Elements are: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class QueueExample {
    public static void main(String[] a) {
        LinkedList list = new LinkedList();
        list.inQueue(52);
        list.inQueue(5);
        list.inQueue(12);
        list.display();
        list.deQueue();
        list.inQueue(71);
        list.deQueue();
        list.display();

    }
}
