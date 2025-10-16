class Prototype implements Cloneable {
    int id;
    Prototype(int id) { this.id = id; }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloningDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype p1 = new Prototype(10);
        Prototype p2 = (Prototype) p1.clone();
        System.out.println("Original ID: " + p1.id + ", Cloned ID: " + p2.id);
    }
}
