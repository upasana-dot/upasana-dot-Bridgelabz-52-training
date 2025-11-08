import java.util.*;

public class Example3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Without autoboxing (manually wrap)
        list.add(Integer.valueOf(10));

        // With autoboxing (compiler automatically converts)
        list.add(20);

        System.out.println(list);
    }
}
