interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public int getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    public abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println("ID: " + itemId + ", Title: " + title + ", Author: " + author);
    }
}

class Book extends LibraryItem implements Reservable {
    public Book(int id, String title, String author) { super(id, title, author); }

    @Override
    public int getLoanDuration() { return 14; }

    @Override
    public void reserveItem() { System.out.println("Book reserved."); }

    @Override
    public boolean checkAvailability() { return true; }
}

class Magazine extends LibraryItem implements Reservable {
    public Magazine(int id, String title, String author) { super(id, title, author); }

    @Override
    public int getLoanDuration() { return 7; }

    @Override
    public void reserveItem() { System.out.println("Magazine reserved."); }

    @Override
    public boolean checkAvailability() { return true; }
}

class DVD extends LibraryItem implements Reservable {
    public DVD(int id, String title, String author) { super(id, title, author); }

    @Override
    public int getLoanDuration() { return 3; }

    @Override
    public void reserveItem() { System.out.println("DVD reserved."); }

    @Override
    public boolean checkAvailability() { return true; }
}

// Main
public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem[] items = {
            new Book(101, "Java Programming", "Alice"),
            new Magazine(102, "Tech Today", "Bob"),
            new DVD(103, "Inception", "Christopher Nolan")
        };

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            if (item instanceof Reservable) ((Reservable) item).reserveItem();
            System.out.println("-------------------");
        }
    }
}
