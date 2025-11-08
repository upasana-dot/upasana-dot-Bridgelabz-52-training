import java.util.functional.Predicate;
public class TemperatureAlert{
    public static void main(String[] args) {
        Predicate<Double> isTooHot = temp -> temp > 30.0;
        Predicate<Double> isTooCold = temp -> temp < 15.0;

        double currentTemperature = 32.5;

        if (isTooHot.test(currentTemperature)) {
            System.out.println("Alert: It's too hot!");
        } else if (isTooCold.test(currentTemperature)) {
            System.out.println("Alert: It's too cold!");
        } else {
            System.out.println("Temperature is just right.");
        }
    }
}
