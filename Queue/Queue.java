public class Queue {
  static int rear;
  static int front;
  static int maxSize;
  static int arrayQueue[];

  public Queue(int maxSize) {
    this.maxSize = maxSize;
    rear = -1;
    front = 0;
    arrayQueue = new int[maxSize];
  }

  static boolean isEmpty() {
    if (front > rear)
      return true;
    else
      return false;

  }

  static boolean isFull() {
    if (rear >= maxSize - 1)
      return true;

    else
      return false;
  }

  static void adQue(int element) {
    if (!isFull()) {
      rear++;
      arrayQueue[rear] = element;
      System.out.println(element + " is added to queue");
    } else
      System.out.println("Queue is full cannot push element");
  }

  static void deQue() {
    int element = 0;

    if (!isEmpty()) {
      element = arrayQueue[rear];
      rear--;
      System.out.println(element + " is deleted from Queue");

    }

    else {
      System.out.println("Queue is empty");
    }

  }

  static void display() {
    System.out.println("Elements of the Queue are:");
    for (int i = front; i <= rear; i++) {
      System.out.printf("%d\t", arrayQueue[i]);
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Queue q = new Queue(5);
    adQue(5);
    adQue(10);
    adQue(12);
    adQue(51);
    display();
    deQue();
    deQue();
    display();

  }

}
