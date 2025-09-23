import java.util.Scanner;

public class ass_d {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int radius = input.nextInt();
        double pi = 3.14;
        
        System.out.println("Area of Circle : " +(pi*radius*radius));
        input.close(); // good practice to close Scanner
    }
}
