package tree;
import java.util.Queue;
import java.util.LinkedList;
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

public class levelOrder {

    public static void LOrder(Node root){
        if(root==null) 
            return;

        Queue<Node> q1=new LinkedList<>();
        q1.offer(root);
        while(!q1.isEmpty()){
            int size=q1.size();

            // for(int i=0;i<size;i++){
                Node ele=q1.poll();
                System.out.print(ele.data+" ");

                if(ele.left!=null) q1.offer(ele.left);
                if(ele.right!=null) q1.offer(ele.right);
            // }
        }
    }

    public static void main(String[] args){
        Node root=new Node(30);

        root.left=new Node(20);
        root.right=new Node(40);

        root.left.left=new Node(120);
        root.left.right=new Node(207);
        root.right.left=new Node(305);
        root.right.right=new Node(500);

        root.left.left.left=new Node(402);
        root.left.left.right=new Node(435);

        LOrder(root);
    }  
}

    
