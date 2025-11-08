package errors;
public class NestedTryExample {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        int index = 5; // invalid index
        int divisor = 0; // causes divide by zero

        try {
            try {
                int value = arr[index];
                System.out.println("Value: " + value);
                System.out.println("Result: " + (value / divisor));
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            }
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
    }
}
