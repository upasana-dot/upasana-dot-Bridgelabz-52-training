import java.util.Scanner;

public class ass_c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int temp_c = input.nextInt();
        
        System.out.println("Fahernheit : " +((temp_c*(9/5))+32));
        input.close(); // good practice to close Scanner
    }
}
