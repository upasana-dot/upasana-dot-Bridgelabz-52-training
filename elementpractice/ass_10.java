import java.util.*;

public class ass_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your height in centimeters: ");
        double heightCm = sc.nextDouble();

        double totalInches = heightCm / 2.54;      // convert cm → inches
        int feet = (int)(totalInches / 12);        // 12 inches = 1 foot
        double inches = totalInches % 12;          // remaining inches

        System.out.printf("Your Height in cm is %.2f while in feet is %d and inches is %.2f\n",
                heightCm, feet, inches);


    }
    
}
