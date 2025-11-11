package map;
import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        String text = "Hello world, hello Java!";
        Map<String, Integer> freq = new HashMap<>();

        text = text.toLowerCase().replaceAll("[^a-z ]", "");
        for (String word : text.split("\\s+")) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        System.out.println(freq);
    }
}
