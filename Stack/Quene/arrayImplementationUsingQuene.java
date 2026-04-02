package Stack.Quene;

public class arrayImplementationUsingQuene {
        private int maxSize;
        private long[] queneArray;
        private int front;
        private int rear;
        private int nItems;
    
        public arrayImplementationUsingQuene(int size) {
            this.maxSize = size;
            this.queneArray = new long[maxSize];
            this.front = 0;
            this.rear = -1;
            this.nItems = 0;
        }
    
        public void insert(long value) {
            if (rear == maxSize - 1) {
                rear = -1; // Wrap around
            }
            queneArray[++rear] = value;
            nItems++;
        }
    
        public long remove() {
            long temp = queneArray[front++];
            if (front == maxSize) {
                front = 0; // Wrap around
            }
            nItems--;
            return temp;
        }
    
        public long peekFront() {
            return queneArray[front];
        }
    
        public boolean isEmpty() {
            return (nItems == 0);
        }
    
        public boolean isFull() {
            return (nItems == maxSize);
        }
    
        public int size() {
            return nItems;
        }
        public static void main(String[] args) {
            arrayImplementationUsingQuene quene = new arrayImplementationUsingQuene(5);
            quene.insert(10);
            quene.insert(20);
            quene.insert(30);
            quene.insert(40);
            quene.insert(50);
    
            System.out.println("Front of the queue: " + quene.peekFront());
    
            System.out.println("Removing from queue: " + quene.remove());
            System.out.println("Front of the queue after removal: " + quene.peekFront());
    
            quene.insert(60);
            System.out.println("Front of the queue after inserting 60: " + quene.peekFront());
        }
    
    
}
