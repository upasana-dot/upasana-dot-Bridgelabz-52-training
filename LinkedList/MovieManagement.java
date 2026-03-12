package LinkedList;
class Movie{

    String title;
    String director;
    int year;
    double rating;

    Movie next;
    Movie prev;

    Movie(String t,String d,int y,double r){

        title=t;
        director=d;
        year=y;
        rating=r;
    }
}

class MovieList{

    Movie head;
    Movie tail;

    void addMovie(String t,String d,int y,double r){

        Movie newNode=new Movie(t,d,y,r);

        if(head==null){
            head=tail=newNode;
            return;
        }

        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }

    void displayForward(){

        Movie temp=head;

        while(temp!=null){

            System.out.println(
            temp.title+" "+temp.director+" "+temp.year+" "+temp.rating);

            temp=temp.next;
        }
    }

    void displayReverse(){

        Movie temp=tail;

        while(temp!=null){

            System.out.println(temp.title);

            temp=temp.prev;
        }
    }
}

public class MovieManagement{

    public static void main(String[] args){

        MovieList list=new MovieList();

        list.addMovie("Inception","Nolan",2010,9.0);
        list.addMovie("Avatar","Cameron",2009,8.5);

        list.displayForward();
    }
}