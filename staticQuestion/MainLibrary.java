import java.util.*;
class Book {
    static String libraryName = "City Central Library";
    final String isbn;
    String title, author;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + title + 
                               ", Author: " + author +
                               ", ISBN: " + isbn);
        }
    }
}

public class MainLibrary {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "James Gosling", "ISBN101");
        Book b2 = new Book("AI & ML", "Andrew Ng", "ISBN102");

        b1.displayBookDetails();
        b2.displayBookDetails();

        Book.displayLibraryName();
    }
}
