public class Example6 {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("123abc");
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format!");
        }
    }
}

