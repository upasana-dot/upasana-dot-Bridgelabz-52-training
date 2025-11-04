public class Q6 {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("abc"); // invalid input
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e);
        }
    }
}
