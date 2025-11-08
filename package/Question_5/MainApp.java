import library.books.*;
import library.members.*;
import library.transactions.*;

public class MainApp {
    public static void main(String[] args) {
        Book b = new Book("Data Structures");
        Member m = new Member("Upasana");
        Transaction t = new Transaction();
        t.issueBook(b, m);
    }
}
