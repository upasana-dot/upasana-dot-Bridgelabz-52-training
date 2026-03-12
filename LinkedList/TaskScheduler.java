package LinkedList;
class Task{

    int id;
    String name;
    int priority;
    Task next;

    Task(int i,String n,int p){
        id=i;
        name=n;
        priority=p;
    }
}

class TaskList{

    Task head;

    void addTask(int id,String name,int priority){

        Task newNode=new Task(id,name,priority);

        if(head==null){

            head=newNode;
            newNode.next=head;
            return;
        }

        Task temp=head;

        while(temp.next!=head)
            temp=temp.next;

        temp.next=newNode;
        newNode.next=head;
    }

    void display(){

        if(head==null) return;

        Task temp=head;

        do{

            System.out.println(
            temp.id+" "+temp.name+" "+temp.priority);

            temp=temp.next;

        }while(temp!=head);
    }
}

public class TaskScheduler{

    public static void main(String[] args){

        TaskList list=new TaskList();

        list.addTask(1,"Coding",1);
        list.addTask(2,"Meeting",2);

        list.display();
    }
}