import static java.lang.Math.*;

public class StaticImportDemo {
    public static void main(String[] args) {
        double a = 25;
        double b = 3;

        System.out.println("Square root: " + sqrt(a));
        System.out.println("Power: " + pow(a, b));
        System.out.println("Max: " + max(a, b));
        System.out.println("Min: " + min(a, b));
        System.out.println("Absolute: " + abs(-10.5));
    }
}
