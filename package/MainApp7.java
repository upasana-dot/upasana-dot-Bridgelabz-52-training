import static java.lang.Math.*;
import com.bank.util.InterestCalculator;

public class MainApp7 {
    public static void main(String[] args) {
        double si = InterestCalculator.calculateSimpleInterest(10000, 5, 2);
        double ci = 10000 * (pow((1 + 5 / 100.0), 2)) - 10000;

        System.out.println("Simple Interest: " + si);
        System.out.println("Compound Interest: " + ci);
    }
}
