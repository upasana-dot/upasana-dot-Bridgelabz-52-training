package map;
import java.util.*;

public class Q8 {
    public static void main(String[] args) {
        String[] votes = {"A", "B", "C", "A", "B", "A", "C", "A", "B", "A"};
        Map<String, Integer> voteCount = new HashMap<>();

        for (String v : votes) {
            voteCount.put(v, voteCount.getOrDefault(v, 0) + 1);
        }

        System.out.println(voteCount);
    }
}
