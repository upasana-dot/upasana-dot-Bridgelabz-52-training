
package Stack.Quene;
import java.util.Stack;
public class implementQueneUsingStack {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public implementQueneUsingStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void insert(int value) {
        stack1.push(value);
    }

    public int remove() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return stack2.pop();
    }

    public int peekFront() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return stack2.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {
        implementQueneUsingStack quene = new implementQueneUsingStack();
        quene.insert(10);
        quene.insert(20);
        quene.insert(30);

        System.out.println("Front of the queue: " + quene.peekFront());

        System.out.println("Removing from queue: " + quene.remove());
        System.out.println("Front of the queue after removal: " + quene.peekFront());
    }
    
}
