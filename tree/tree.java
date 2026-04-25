package tree;

public class tree {

    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }  
    }

    public static void preorder(Node root){
        if(root==null) return ;
        System.out.println(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args){
        Node root=new Node(20);
        root.left=new Node(10);
        root.right=new Node(30);
        root.left.left=new Node(5);
        root.left.right=new Node(7);

        root.right.left=new Node(25);
        root.right.right=new Node(35);

        preorder(root);

    }
    
}
