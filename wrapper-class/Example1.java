import java.util.*;

public class Example1 {
    public static void main(String[] args) {
        //  Not allowed – int is primitive
        // ArrayList<int> list = new ArrayList<>();

        //  Allowed – Integer is an object
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        System.out.println(list);
    }
}
