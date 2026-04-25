package tree;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}


public class implementtree {
    public static void main(String[] args){
        Node root=new Node(30);

        root.left=new Node(20);
        root.right=new Node(40);

        root.left.left=new Node(10);
        root.left.right=new Node(25);
        root.right.left=new Node(35);
        root.right.right=new Node(50);

        

    }
    
    
}
