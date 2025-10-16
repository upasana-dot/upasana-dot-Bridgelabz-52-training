import java.util.function.Predicate;

public class TemperatureAlert {
    public static void main(String[] args) {
        Predicate<Double> highTemp = temp -> temp > 40.0;
        
        double currentTemp = 42.5;
        if (highTemp.test(currentTemp)) {
            System.out.println("⚠️ Alert! High temperature: " + currentTemp + "°C");
        } else {
            System.out.println("Temperature is normal.");
        }
    }
}
