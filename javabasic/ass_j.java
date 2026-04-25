import java.util.Scanner;

public class ass_j {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int km = input.nextInt();
        
        System.out.println("Kilometers to miles " + (km * 0.621371));
        input.close(); // good practice to close Scanner
    }
}
