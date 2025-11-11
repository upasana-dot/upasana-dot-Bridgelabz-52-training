package collection.Queue;
import java.util.LinkedList;
import java.util.Queue;

class Q4 {
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    // Push operation
    public void push(int x) {
        q2.add(x);
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        // Swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    // Pop operation
    public int pop() {
        if (q1.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return q1.remove();
    }

    // Top operation
    public int top() {
        if (q1.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return q1.peek();
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        Q4 stack = new Q4();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Top element: " + stack.top()); // 3
        System.out.println("Pop: " + stack.pop()); // 3
        System.out.println("Top element now: " + stack.top()); // 2
    }
}

