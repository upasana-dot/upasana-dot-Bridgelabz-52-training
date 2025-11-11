package collection.Queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Q1 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Original Queue: " + queue);
        reverse(queue);
        System.out.println("Reversed Queue: " + queue);
    }

    public static void reverse(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        // Remove all elements from queue and push to stack
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        // Pop all from stack and add back to queue (reversed order)
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }
}
