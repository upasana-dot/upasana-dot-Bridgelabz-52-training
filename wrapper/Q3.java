import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // This happens implicitly due to autoboxing
        // list.add(5);

        // Without autoboxing, you must manually box it
        list.add(Integer.valueOf(5));

        System.out.println(list);
    }
}
