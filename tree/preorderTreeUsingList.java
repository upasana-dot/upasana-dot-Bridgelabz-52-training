package tree;

import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }  
    
    static List<Integer> preorder(Node root){
        List<Integer> list=new ArrayList<>();
        if(root==null) return list;
    
        list.add(root.data);
        list.addAll(preorder(root.left));
        list.addAll(preorder(root.right));
    
        return list;
    }

    
}



public class preorderTreeUsingList {
    public static void main(String[] args){
        List<Integer> list=new ArrayList<>();

        Node root=new Node(20);
        root.left=new Node(10);
        root.right=new Node(30);
        root.left.left=new Node(5);
        root.left.right=new Node(7);

        root.right.left=new Node(25);
        root.right.right=new Node(35);




    }
    
}
