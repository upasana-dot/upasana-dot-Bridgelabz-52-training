import java.util.Scanner;

public class ass_b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        int b = input.nextInt();
        
        System.out.println("The sum of two numbers: " + (a + b));
        input.close(); // good practice to close Scanner
    }
}

