import com.bank.util.InterestCalculator;

public class MainApp8 {
    public static void main(String[] args) {
        InterestCalculator calc = new InterestCalculator();
        System.out.println("SI: " + calc.calculateSimpleInterest(1000, 5, 2));
        System.out.println("CI: " + calc.calculateCompoundInterest(1000, 5, 2));
    }
}
