package LinkedList;
class Item{

    int id;
    String name;
    int quantity;
    double price;
    Item next;

    Item(int i,String n,int q,double p){

        id=i;
        name=n;
        quantity=q;
        price=p;
    }
}

class Inventory{

    Item head;

    void addItem(int id,String name,int q,double price){

        Item newNode=new Item(id,name,q,price);

        newNode.next=head;
        head=newNode;
    }

    void totalValue(){

        double total=0;

        Item temp=head;

        while(temp!=null){

            total += temp.price*temp.quantity;

            temp=temp.next;
        }

        System.out.println("Total Value="+total);
    }
}

public class InventorySystem{

    public static void main(String[] args){

        Inventory inv=new Inventory();

        inv.addItem(1,"Laptop",5,50000);
        inv.addItem(2,"Mouse",10,500);

        inv.totalValue();
    }
}