package map;
import java.util.*;

public class Q15 {
    public static void main(String[] args) {
        Map<String, Integer> visits = new HashMap<>();
        String[] pages = {"home", "about", "products", "home", "products", "contact", "home"};

        for (String page : pages) {
            visits.put(page, visits.getOrDefault(page, 0) + 1);
        }

        System.out.println("Page Visits:");
        visits.entrySet().stream()
                .sorted((a, b) -> b.getValue() - a.getValue())
                .forEach(e -> System.out.println(e.getKey() + " → " + e.getValue()));

        // Most visited
        String topPage = Collections.max(visits.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println("\nMost visited page: " + topPage);
    }
}
