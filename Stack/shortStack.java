package Stack;

public class shortStack {
    private int maxSize;
    private long[] stackArray;
    private int top;

    public shortStack(int size) {
        this.maxSize = size;
        this.stackArray = new long[maxSize];
        this.top = -1;
    }

    public void push(long value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
        } else {
            System.out.println("Stack is full. Cannot push " + value);
        }
    }

    public long pop() {
        if (!isEmpty()) {
            return stackArray[top--];
        } else {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // Return -1 to indicate stack is empty
        }
    }

    public long peek() {
        if (!isEmpty()) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; // Return -1 to indicate stack is empty
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public int getMaxSize() {
        throw new UnsupportedOperationException("Unimplemented method 'getMaxSize'");
    }
    public static void main(String[] args) {
        shortStack stack = new shortStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Top of the stack: " + stack.peek());

        System.out.println("Popping from stack: " + stack.pop());
        System.out.println("Popping from stack: " + stack.pop());

        System.out.println("Top of the stack after popping: " + stack.peek());
    }
    
}
