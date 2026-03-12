package LinkedList;

class StudentNode{
    int roll;
    String name;
    int age;
    String grade;
    StudentNode next;

    StudentNode(int r,String n,int a,String g){
        roll=r;
        name=n;
        age=a;
        grade=g;
        next=null;
    }
}

class StudentList{

    StudentNode head;

    void addFirst(int r,String n,int a,String g){
        StudentNode newNode = new StudentNode(r,n,a,g);

        newNode.next = head;
        head = newNode;
    }

    void addLast(int r,String n,int a,String g){

        StudentNode newNode = new StudentNode(r,n,a,g);

        if(head==null){
            head=newNode;
            return;
        }

        StudentNode temp=head;

        while(temp.next!=null)
            temp=temp.next;

        temp.next=newNode;
    }

    void delete(int roll){

        if(head==null) return;

        if(head.roll==roll){
            head=head.next;
            return;
        }

        StudentNode temp=head;

        while(temp.next!=null && temp.next.roll!=roll){
            temp=temp.next;
        }

        if(temp.next!=null)
            temp.next=temp.next.next;
    }

    void search(int roll){

        StudentNode temp=head;

        while(temp!=null){

            if(temp.roll==roll){
                System.out.println("Found: "+temp.name);
                return;
            }

            temp=temp.next;
        }

        System.out.println("Not Found");
    }

    void updateGrade(int roll,String newGrade){

        StudentNode temp=head;

        while(temp!=null){

            if(temp.roll==roll){
                temp.grade=newGrade;
                return;
            }

            temp=temp.next;
        }
    }

    void display(){

        StudentNode temp=head;

        while(temp!=null){

            System.out.println(
            temp.roll+" "+temp.name+" "+temp.age+" "+temp.grade);

            temp=temp.next;
        }
    }
}

public class StudentListDemo {
    public static void main(String[] args){

        StudentList list=new StudentList();

        list.addFirst(1,"Rahul",20,"A");
        list.addLast(2,"Anita",21,"B");

        list.display();

        list.updateGrade(1,"A+");

        list.delete(2);

        list.display();
    }
}
