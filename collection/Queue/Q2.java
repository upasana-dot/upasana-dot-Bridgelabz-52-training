package collection.Queue;
import java.util.LinkedList;
import java.util.Queue;

public class Q2 {
    public static void main(String[] args) {
        int n = 5;
        generateBinaryNumbers(n);
    }

    public static void generateBinaryNumbers(int n) {
        Queue<String> queue = new LinkedList<>();
        queue.add("1");

        for (int i = 0; i < n; i++) {
            String front = queue.remove();
            System.out.print(front + " ");

            queue.add(front + "0");
            queue.add(front + "1");
        }
    }
}

