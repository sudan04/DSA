import java.util.Scanner;

public class Stack{
    static int maxSize;
    static int top;
    static int[] stackArray;

    Stack(int maxSize){
        this.maxSize= maxSize;
        top= -1;
        stackArray= new int[maxSize];
    }
    static boolean isEmpty(){
        if(top==-1)
        return true;
        else
        return false;

    }
    static boolean isFull(){
        if(top==maxSize-1)
        return true;

        else
        return false;
    }

    static void Push(int element){
        if(!isFull()){
            top++;
            stackArray[top]= element;
        }
        else
        System.out.println("Stack is full cannot push element");
    }


    static void Pop(){
      int element= 0;

      if(!isEmpty()){
        element= stackArray[top];
        top--;    
        System.out.println(element+ " is popped from stack");

      }

      else {
        System.out.println("Stack is empty");
      }

    }


    static void Display(){
      for(int i= 0; i<=top; i++){
        System.out.printf("%d\t", stackArray[i]);
      }
    }





    
    public static void main(String[] args){
      Scanner scan= new Scanner(System.in);

      System.out.println("Enter size of stack");
      int n= scan.nextInt();

      Stack s= new Stack(n);
    int ch=0, element;
    

    while(true){
        System.out.printf("\nMenu\n");
        System.out.printf("1.push\n");
         System.out.printf("2.Display Elements\n");
         System.out.printf("3.POP\n");
         System.out.printf("4. Exit\n");
   
     System.out.printf("Enter your choice\n");
    ch= scan.nextInt();

        switch(ch){
            case 1:
            System.out.println("Enter a element to push");
            element= scan.nextInt();
            Push(element);
            break;

            case 2:
              Display();
              break;

             case 3:
            Pop();
            break;


            case 4:
            return;


            default:
             System.out.println("Enter valid choice");

        }
    }
    }
}