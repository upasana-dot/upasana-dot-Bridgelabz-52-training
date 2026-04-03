package Quene;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class circularQueueUsingLinkedListImpl {
    Node front;
    Node rear;
    int size;
    circularQueueUsingLinkedListImpl(int data){
        this.front=null;
        this.rear=null;
        this.size=0;
    }
    // enqueue: insert from end(rear)
    void enqueue(int val){
        Node newNode=new Node(val);
        if(front==null){
            front=rear=newNode;
            rear.next=front;
            return;
        }
        rear.next=newNode;
        rear=newNode;
        rear.next=front;
        size++;
    }

    // dequene: delete from the front
    void dequeue(){
        if(front==null){
            System.out.println("Queue is empty");
            return;
        }if(front==rear){
            front=rear=null;
            size--;
        }
        else{
            front=front.next;
            rear.next=front;
            size++;
        }

    }

    void display(){
        Node temp=front;
        if(temp==null){
            System.out.println("Queue is empty");
            return;
        }while(temp.next!=front){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.print(temp.data+" ");

    }

    public static void main(String[] args){
        circularQueueUsingLinkedListImpl c=new circularQueueUsingLinkedListImpl(0);
        c.enqueue(10);   // 10
        c.enqueue(20);   // 10 20
        c.enqueue(30);   // 10 20 30
        c.enqueue(50);   // 10 20 30 50
        c.display();
        System.out.println();
        c.dequeue();    // 20 30 40
        c.dequeue();    // 30 40
        c.dequeue();    // 40
        c.dequeue();    // empty
        c.display();
    }
}
