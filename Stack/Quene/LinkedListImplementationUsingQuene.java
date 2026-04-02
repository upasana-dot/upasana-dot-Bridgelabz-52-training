package Stack.Quene;

public class LinkedListImplementationUsingQuene {
    private Node front;
    private Node rear;
    private int nItems;

    private class Node {
        long data;
        Node next;

        public Node(long data) {
            this.data = data;
            this.next = null;
        }
    }


    public LinkedListImplementationUsingQuene() {
        this.front = null;
        this.rear = null;
        this.nItems = 0;
    }

    public void insert(long value) {
        Node newNode = new Node(value);
        if (rear != null) {
            rear.next = newNode;
        }
        rear = newNode;
        if (front == null) {
            front = rear;
        }
        nItems++;
    }

    public long remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot remove.");
            return -1; // Return -1 to indicate queue is empty
        }
        long temp = front.data;
        front = front.next;
        nItems--;
        if (front == null) {
            rear = null; // If the queue becomes empty, set rear to null
        }
        return temp;
    }

    public long peekFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return -1; // Return -1 to indicate queue is empty
        }
        return front.data;
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public int size() {
        return nItems;
    }
    public static void main(String[] args) {
        LinkedListImplementationUsingQuene queue = new LinkedListImplementationUsingQuene();
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        System.out.println("Front element: " + queue.peekFront());
        System.out.println("Queue size: " + queue.size());
        System.out.println("Removed element: " + queue.remove());
        System.out.println("Front element after removal: " + queue.peekFront());
        System.out.println("Queue size after removal: " + queue.size());
    }
    
}
