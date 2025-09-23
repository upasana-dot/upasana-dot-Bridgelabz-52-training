import java.util.Scanner;
public class ass_i {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        
        System.out.println("The average of three numbers: " + (a + b + c)/3);
        input.close(); // good practice to close Scanner
    }
}
