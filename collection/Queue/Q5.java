package collection.Queue;
public class Q5 {
    private int[] buffer;
    private int size;
    private int start = 0;
    private int count = 0;

    public Q5(int size) {
        this.size = size;
        buffer = new int[size];
    }

    public void insert(int value) {
        int end = (start + count) % size;
        buffer[end] = value;
        if (count == size) {
            // overwrite oldest → move start forward
            start = (start + 1) % size;
        } else {
            count++;
        }
    }

    public void display() {
        System.out.print("Buffer: [");
        for (int i = 0; i < count; i++) {
            int index = (start + i) % size;
            System.out.print(buffer[index]);
            if (i < count - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Q5 cb = new Q5(3);
        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.display();  // [1, 2, 3]
        cb.insert(4);  // overwrites 1
        cb.display();  // [2, 3, 4]
    }
}
