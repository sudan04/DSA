class Node{
    int data;
    Node left, right;

    Node(int data){
        this.data= data;
        left= right= null;
    }
}

class BinaryTree{
    Node root;
    BinaryTree(){
        root= null;
    }
    
    void preOrder(Node node){
        if(node!=null){
            System.out.print(node.data+" ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    
    void inOrder(Node node){
        if(node!=null){
            inOrder(node.left);
            System.out.print(node.data+" ");   
            inOrder(node.right);
        }
        
    }

    void postOrder(Node node){
        if(node!=null){
            postOrder(node.left); 
            postOrder(node.right);        
            System.out.print(node.data+" ");  
        }
    }


        Node insert(Node root, int value) {
            if (root == null) {
                root = new Node(value);
                return root;
            }
    
            if (value < root.data) {
                root.left = insert(root.left, value);
            } else {
                root.right = insert(root.right, value);
            }
    
            return root;
        }
}


public class BinaryTreeExample {
    public static void main(String[] args){
        BinaryTree bt= new BinaryTree();
        
        // bt.root= new Node(1);
        // bt.root.left= new Node(2);
        // bt.root.left.left= new Node(4);
        // bt.root.left.left.left= new Node(8);
        // bt.root.left.right= new Node(5);
        // bt.root.right= new Node(3);
        // bt.root.right.left= new Node(6);
        // bt.root.right.left.left= new Node(9);
        // bt.root.right.left.right= new Node(10);
        // bt.root.right.right= new Node(7);

        bt.root = bt.insert(bt.root, 23);
        
        System.out.println("preOrder: ");
        bt.preOrder(bt.root);
        System.out.println();

        System.out.println("InOrder: ");
        bt.inOrder(bt.root);
        System.out.println();

        System.out.println("PostOrder: ");
        bt.postOrder(bt.root);

        

    }
}
