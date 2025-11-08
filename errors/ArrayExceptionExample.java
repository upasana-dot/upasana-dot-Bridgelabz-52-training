package errors;
public class ArrayExceptionExample {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        int index = 5; // try changing this to a valid index

        try {
            System.out.println("Value at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
    }
}

