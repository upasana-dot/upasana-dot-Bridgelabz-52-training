package collection.set;
import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        Set<Integer> symDiff = new HashSet<>(set1);
        symDiff.addAll(set2);      // Union
        Set<Integer> tmp = new HashSet<>(set1);
        tmp.retainAll(set2);       // Intersection
        symDiff.removeAll(tmp);    // Remove intersection

        System.out.println("Symmetric Difference: " + symDiff);
    }
}
