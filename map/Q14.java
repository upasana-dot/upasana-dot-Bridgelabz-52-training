package map;
import java.util.*;

public class Q14 {
    public static void main(String[] args) {
        Map<String, Double> salary = new HashMap<>();
        salary.put("Aman", 40000.0);
        salary.put("Riya", 55000.0);
        salary.put("Karan", 48000.0);

        salary.put("Aman", salary.get("Aman") * 1.10); // raise 10%

        double avg = salary.values().stream().mapToDouble(v -> v).average().orElse(0);
        double max = Collections.max(salary.values());

        System.out.println("Average salary: " + avg);
        salary.forEach((n, s) -> { if (s == max) System.out.println("Highest: " + n + " - " + s); });
    }
}
