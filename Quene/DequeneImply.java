package Quene;

class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}

public class DequeneImply {
    Node front;
    Node rear;
    int size;
    DequeneImply(){
        this.front=null;
        this.rear=null;
        this.size=0;
    }
    void insertFront(int val){
        Node newNode=new Node(val);
        if(front==null){
            front=rear=newNode;
            return;
        }else{
            newNode.next=front;
            front.prev=newNode;
            front=newNode;

         }
        }

        void insertatrear(int val){
            Node newNode=new Node(val);
            if(rear==null){
                front=rear=null;
                return;
            }else{
                newNode.prev=rear;
                rear.next=newNode;
                rear=newNode;
            }
        }

        void deleteFront(){
            if(front==null){
                System.out.println("quene is empty");
                return;
            }
            front=front.next;
            if(front!=null){
                front.prev=null;
            }else{
                rear=null;
            }

        }
        void deleteatrear(){
            if(rear==null){
                System.out.println("quene is empty");
                return;
            }else{
                rear=rear.prev;
                rear.next=null;
                front=null;
            }
        }

        void display(){
            Node temp=front;
            if(temp==null){
                System.out.println("empty quene");
                return;
            }else{
                while(temp!=null){
                    System.out.print(temp.data+" ");
                    temp=temp.next;
                }
            }

        }
        public static void main(String[] args){
            DequeneImply d=new DequeneImply();
            d.insertFront(10);
            d.insertFront(20);
            d.insertatrear(30);
            d.insertatrear(40);
            d.display();
            d.deleteFront();
            d.display();
            d.deleteatrear();
            d.display();
        }

    }

    

