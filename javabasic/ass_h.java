import java.util.Scanner;
public class ass_h {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int base = input.nextInt();
        int exponent = input.nextInt();
        
        System.out.println("power :  " + Math.pow(base , exponent));
        input.close(); // good practice to close Scanner
    }
}
