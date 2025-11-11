package map;
import java.util.*;

public class Q12 {
    public static void main(String[] args) {
        Map<String, String> countries = new TreeMap<>();

        countries.put("India", "New Delhi");
        countries.put("USA", "Washington DC");
        countries.put("France", "Paris");
        countries.put("Japan", "Tokyo");
        countries.put("Germany", "Berlin");
        countries.put("Italy", "Rome");
        countries.put("China", "Beijing");
        countries.put("Canada", "Ottawa");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter country: ");
        String country = sc.nextLine();

        if (countries.containsKey(country))
            System.out.println("Capital: " + countries.get(country));
        else
            System.out.println("Unknown country!");

        System.out.println("\nAll Countries (alphabetical):");
        for (Map.Entry<String, String> e : countries.entrySet()) {
            System.out.println(e.getKey() + " → " + e.getValue());
        }
    }
}

