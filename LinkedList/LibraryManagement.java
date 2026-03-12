package LinkedList;

class Book {
    int id;
    String title;
    String author;
    String genre;
    boolean available;

    Book next;
    Book prev;

    Book(int id, String title, String author, String genre, boolean available) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = available;
    }
}

class Library {

    Book head;
    Book tail;

    void addBook(int id, String title, String author, String genre, boolean available) {

        Book newBook = new Book(id, title, author, genre, available);

        if (head == null) {
            head = tail = newBook;
            return;
        }

        tail.next = newBook;
        newBook.prev = tail;
        tail = newBook;
    }

    void removeBook(int id) {

        Book temp = head;

        while (temp != null) {

            if (temp.id == id) {

                if (temp.prev != null)
                    temp.prev.next = temp.next;

                if (temp.next != null)
                    temp.next.prev = temp.prev;

                if (temp == head)
                    head = temp.next;

                if (temp == tail)
                    tail = temp.prev;

                return;
            }

            temp = temp.next;
        }
    }

    void searchByTitle(String title) {

        Book temp = head;

        while (temp != null) {

            if (temp.title.equals(title))
                System.out.println("Found: " + temp.title + " by " + temp.author);

            temp = temp.next;
        }
    }

    void updateAvailability(int id, boolean status) {

        Book temp = head;

        while (temp != null) {

            if (temp.id == id) {
                temp.available = status;
                return;
            }

            temp = temp.next;
        }
    }

    void displayForward() {

        Book temp = head;

        while (temp != null) {

            System.out.println(temp.id + " "
                    + temp.title + " "
                    + temp.author + " "
                    + temp.genre + " "
                    + temp.available);

            temp = temp.next;
        }
    }

    void displayReverse() {

        Book temp = tail;

        while (temp != null) {

            System.out.println(temp.title);

            temp = temp.prev;
        }
    }

    void countBooks() {

        int count = 0;
        Book temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        System.out.println("Total Books = " + count);
    }
}

public class LibraryManagement {

    public static void main(String[] args) {

        Library lib = new Library();

        lib.addBook(1, "Java Basics", "James Gosling", "Programming", true);
        lib.addBook(2, "Data Structures", "Mark Allen", "Education", true);

        lib.displayForward();

        lib.searchByTitle("Java Basics");

        lib.updateAvailability(1, false);

        lib.countBooks();
    }
}