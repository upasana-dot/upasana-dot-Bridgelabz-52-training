import library.books.*;
import library.members.*;
import library.transactions.*;

public class MainApp5 {
    public static void main(String[] args) {
        Book b = new Book("Java Programming", "James Gosling");
        Member m = new Member("Upasana");
        Transaction t = new Transaction();

        b.display();
        m.display();
        t.issueBook(b, m);
    }
}
