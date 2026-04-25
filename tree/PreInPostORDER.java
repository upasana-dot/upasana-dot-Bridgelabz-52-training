package tree;
class Node{
    char data;
    Node left;
    Node right;
    Node(char data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

public class PreInPostORDER {
    public static void main(String[] args){
        Node root=new Node('A');

        root.left=new Node('B');
        root.right=new Node('C');

        root.left.left=new Node('D');
        root.left.right=new Node('E');
        root.left.right.left=new Node('I');
        root.left.right.right=new Node('J');
        root.right.left=new Node('G');
        root.right.right=new Node('H');
        root.right.left.left=new Node('K');

            System.out.println("Preorder Traversal:");
            preorder(root);
            System.out.println("Inorder Traversal:");
            inorder(root);
            System.out.println("Postorder Traversal:");
            postorder(root);

    }
    static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    static void inorder(Node root){
            if(root==null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    
}
