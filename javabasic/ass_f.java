import java.util.Scanner;

public class ass_f {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int p = input.nextInt();
        int r = input.nextInt();
        int t = input.nextInt();
        int si= (p*r*t)/100;
        
        System.out.println("Simple Interest: " + (si));
        input.close(); // good practice to close Scanner
    }
}
