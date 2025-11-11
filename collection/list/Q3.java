package collection.list;
import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        int rotateBy = 2;

        for (int i = 0; i < rotateBy; i++) {
            list.add(list.remove(0));
        }
        System.out.println(list);
    }
}

