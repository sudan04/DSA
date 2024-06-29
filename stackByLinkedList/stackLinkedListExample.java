class Node{
    int data;
    Node next;

    public Node(int data){
        this.data= data;
        this.next= null;
    }
}

class linkList{
    Node top;
    public linkList(){
        top= null;
    }

    boolean isEmpty(){
        return top==null;
    }

    void push(int data){
        Node newNode= new Node(data);
        int element= newNode.data;
        if(isEmpty()){
            top= newNode;
        }

        else{
            newNode.next=top;
            top= newNode;
        }
        System.out.println(element+" pushed in stack");

    }

    void pop(){
        if(!isEmpty()){
            System.out.println(top.data+" poped from stact");
            top= top.next;
        }

        else{
            System.out.println("Stack is empty: ");
        }
    }

    void display(){
        System.out.println("Elements in the stack are:");
        Node currentTop= top;
        while(currentTop!= null){
            System.out.print(currentTop.data+" ");
            currentTop=currentTop.next;
        }
        System.out.println();
    }
}



public class stackLinkedListExample {
    public static void main(String[] args){
        linkList list= new linkList();
        list.push(23);
        list.push(65);
        list.push(56);
        list.display();
        list.pop();
        list.display();
    }
}
