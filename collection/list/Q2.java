package collection.list;
import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "apple", "orange");
        Map<String, Integer> freq = new HashMap<>();

        for (String s : items) {
            freq.put(s, freq.getOrDefault(s, 0) + 1);
        }
        System.out.println(freq);
    }
}

