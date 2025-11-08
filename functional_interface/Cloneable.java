class Prototype implements Cloneable {
    int value;

    Prototype(int value) {
        this.value = value;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            Prototype original = new Prototype(42);
            Prototype copy = (Prototype) original.clone();

            System.out.println("Original value: " + original.value);
            System.out.println("Cloned value: " + copy.value);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}