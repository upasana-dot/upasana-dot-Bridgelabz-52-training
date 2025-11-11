package collection.real_world;
import java.util.*;

class Book {
    String title;
    Book(String title){this.title=title;}
    public String toString(){return title;}
}

public class Q11 {
    public static void main(String[] args){
        List<Book> books=new ArrayList<>();
        Set<String> members=new HashSet<>();
        Queue<Book> issueQueue=new LinkedList<>();
        Stack<Book> returned=new Stack<>();

        books.add(new Book("Java Basics"));
        books.add(new Book("Data Structures"));

        members.add("M001");
        issueQueue.offer(books.get(0));
        returned.push(books.get(1));

        System.out.println("📘 Issue Queue: "+issueQueue);
        System.out.println("↩ Recently Returned: "+returned.peek());
    }
}
