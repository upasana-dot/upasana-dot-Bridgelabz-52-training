package collection.list;
import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 1, 2, 2, 3, 4);
        List<Integer> result = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        for (int n : list) {
            if (seen.add(n)) result.add(n);
        }
        System.out.println(result);
    }
}
