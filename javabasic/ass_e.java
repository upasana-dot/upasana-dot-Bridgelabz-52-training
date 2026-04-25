import java.util.Scanner;

public class ass_e {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int radius = input.nextInt();
        int height = input.nextInt();
        double pi  = 3.14;
        
        System.out.println("The volume of a cylinder: " + (pi*radius*radius*height));
        input.close(); // good practice to close Scanner
    }
}

