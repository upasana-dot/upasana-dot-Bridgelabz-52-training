interface UnitConverter {
    double convert(double value);
}
public class UnitConverterMain {
    public static void main(String[] args) {
        UnitConverter celsiusToFahrenheit = new UnitConverter() {
            public double convert(double celsius) {
                return (celsius * 9/5) + 32;
            }
        };

        UnitConverter kilometersToMiles = new UnitConverter() {
            public double convert(double kilometers) {
                return kilometers * 0.621371;
            }
        };

        double tempInFahrenheit = celsiusToFahrenheit.convert(25);
        double distanceInMiles = kilometersToMiles.convert(10);

        System.out.println("25 Celsius in Fahrenheit: " + tempInFahrenheit);
        System.out.println("10 Kilometers in Miles: " + distanceInMiles);
    }
}