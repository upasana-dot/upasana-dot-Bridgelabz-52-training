import java.util.Scanner;

public class ass_g {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int l = input.nextInt();
        int w = input.nextInt();
        
        System.out.println("Perimeter of rectangle: " + 2*(l + w));
        input.close(); // good practice to close Scanner
    }
}
