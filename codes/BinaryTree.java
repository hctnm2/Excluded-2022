import java.util.Scanner;
class Node{
    private int data;

    private Node left,right;
    public Node(int data){       //Constructor to work as setter
        this.data=data;
        left=right=null;
    }

    public void setLeft(Node left) {this.left = left;}      //setters for left and right pointers
    public void setRight(Node right) {this.right = right;}
    public int getData() {       //getter for retrieving the value
        return data;
    }        //getters for instance variables
    public Node getLeft() {return left;}
    public Node getRight() {return right;}
}
public class BinaryTree {
    static Node root;
    static Scanner sn=new Scanner(System.in);     //made static so that instance and static methods both can access

    public void insert(){
        Node current=root;
        System.out.println("Enter the value to be inserted");
        int data=sn.nextInt();
        Node n=new Node(data);

        if (root==null)root=n;
        else
        {
            while(true){         //loop terminates internally
                if (n.getData() < current.getData()){

                    if(current.getLeft()==null){
                        current.setLeft(n);
//
                        return;
                    }
                    else current=current.getLeft();
                }
                else{
                    if(current.getRight()==null) {
                        current.setRight(n);
//
                        return;
                    }
                    else current=current.getRight();
                }
            }
        }
    }

    public void Inorder(Node node){
       if(node==null)return;
           Inorder(node.getLeft());
           System.out.print(node.getData()+" ");
           Inorder(node.getRight());
    }

    public void Preorder(Node node){
        if(node==null)return;
        System.out.print(node.getData()+" ");
        Inorder(node.getLeft());
        Inorder(node.getRight());
    }

    public void Postorder(Node node){
        if(node==null)return;
        Inorder(node.getLeft());
        Inorder(node.getRight());
        System.out.print(node.getData()+" ");
    }


    public static void main(String[] args) {
        BinaryTree bt =new BinaryTree();        //so that instance methods can be accessed
        int k=1;
        while(k==1){
            System.out.println("Press 1 for Insertion in tree");
            System.out.println("Press 2 for Inorder traversal in tree");
            System.out.println("Press 3 for Preorder traversal in tree");
            System.out.println("Press 4 for Postorder traversal in tree");
            int choice=sn.nextInt();
        switch(choice){
            case 1:
                bt.insert();
                break;
            case 2:
                bt.Inorder(root);
                break;
            case 3:
                bt.Preorder(root);
                break;
            case 4:
                bt.Postorder(root);
                break;
            default:
                System.out.println("Please enter correct option");
                break;
        }
            System.out.println("Press 0 to terminate or 1 to continue");
            k=sn.nextInt();
        }
}


}
