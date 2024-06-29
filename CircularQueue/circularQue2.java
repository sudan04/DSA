public class circularQue2{
    private int maxSize;
    private int [] queueArray;
    private int front;
    private int rear;
   
    circularQue2(int maxSize){
      front = -1;
      rear = -1;
      this.maxSize = maxSize;
      queueArray = new int [maxSize];
    }
    public boolean isFull(){
      return front == (rear+1) % maxSize;
    }
    public boolean isEmpty(){
      return front == -1;
    }
    public void enqueue(int element){
      if(!isFull()){
        rear = (rear+1)%maxSize;
        queueArray[rear] = element;
        System.out.println(element+" is inserted!!");
        if(front == -1){
          front = 0;
        }
      }else{
        System.out.println("queue overflow");
      }
    }
    public int dequeue(){
      if(!isEmpty()){
        int element = queueArray[front];
        front = (front+1)%maxSize;
        return element;
      }else{
        System.out.println("queue underflow");
        return -1;
      }
    }
   
    public void printQueue(){
      int i;
      if(!isEmpty()){
        System.out.print("Queue list: ");
        for(i = front; i!=rear; i=(i+1)%maxSize){
          System.out.print(queueArray[i]+" ");
        }
        System.out.print(queueArray[i]+" ");
      }else{
        System.out.println("Queue is empty");
      }
      System.out.println();
    }

    public int front(){
      if(!isEmpty()){
        return queueArray[front];
      }else{
        System.out.println("Queue is empty");
        return -1;
      }
    }
   
    public int rear(){
      if(!isEmpty()){
        return queueArray[rear];
      }else{
        System.out.println("Queue is empty");
        return -1;
      }
    }
   
    public static void main(String[] args){
      circularQue2 q = new circularQue2(10);
      q.dequeue();
      q.enqueue(10);
      q.enqueue(20);
      q.enqueue(30);
      q.enqueue(40);
      q.enqueue(50);
     
       q.printQueue();
       System.out.println("List of dequeued elements");
       System.out.println("Element is dequeued "+q.dequeue());
       System.out.println("Element is dequeued "+q.dequeue());
       System.out.println("Element is dequeued "+q.dequeue());
       
       q.printQueue();
       System.out.println("List of new elements");
       q.enqueue(11);
       q.enqueue(22);
       q.enqueue(33);
       
      System.out.println("Front "+q.front());
      System.out.println("rear "+q.rear());
       q.printQueue();
       System.out.println();
    }
  }