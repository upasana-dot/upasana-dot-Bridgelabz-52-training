package map;
import java.util.*;

public class Q9 {
    public static void main(String[] args) {
        Map<String, String> catalog = new TreeMap<>(); // Sorted by ISBN

        // 1. Add books
        catalog.put("978-1234567890", "Java Basics");
        catalog.put("978-0987654321", "Data Structures");
        catalog.put("978-1111111111", "Machine Learning");

        // 2. Search by ISBN
        String isbn = "978-0987654321";
        if (catalog.containsKey(isbn)) {
            System.out.println("Book found: " + catalog.get(isbn));
        } else {
            System.out.println("Book not found!");
        }

        // 3. Remove a book
        catalog.remove("978-1111111111");

        // 4. Print all sorted by ISBN
        System.out.println("\nAll Books:");
        for (Map.Entry<String, String> e : catalog.entrySet()) {
            System.out.println("ISBN: " + e.getKey() + " → Title: " + e.getValue());
        }

        // 5. Search by Title (loop through map)
        String titleSearch = "Java Basics";
        boolean found = false;
        for (Map.Entry<String, String> e : catalog.entrySet()) {
            if (e.getValue().equalsIgnoreCase(titleSearch)) {
                System.out.println("\nFound ISBN for " + titleSearch + ": " + e.getKey());
                found = true;
            }
        }
        if (!found) System.out.println("Title not found!");
    }
}
