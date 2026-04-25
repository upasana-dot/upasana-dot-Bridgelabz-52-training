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

public class BSTImpl {
    Node root;
    private Node insertRec(Node root,int data){
        if(root==null){
            root=new Node(data);
            return root;
        }
        if(data<root.data)
            root.left=insertRec(root.left,data);
        else if(data>root.data)
            root.right=insertRec(root.right,data);
        return root;
    }


// insert new data using recursion
    public void insert(int data){
        root=insertRec(root,data);
    }

// inorder traversal using recursion
    private void inorderRec(Node root){
        if(root!=null){
            inorderRec(root.left);
            System.out.print(root.data+" ");
            inorderRec(root.right);
        }
    }

    public void inorder(){
        inorderRec(root);
    }

    public static void main(String[] args){
        BSTImpl bst=new BSTImpl();
        bst.insert(100);
        bst.insert(202);
        bst.insert(300);
        bst.insert(400);
        bst.insert(502);
        bst.insert(603);
        bst.insert(123);

        bst.inorder();
    }
}
