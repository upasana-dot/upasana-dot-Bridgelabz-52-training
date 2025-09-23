package level_2;
public class UnitConverter2 {
    public static double convertYardsToFeet(double yards) { return yards * 3; }
    public static double convertFeetToYards(double feet) { return feet * 0.333333; }
    public static double convertMetersToInches(double m) { return m * 39.3701; }
    public static double convertInchesToMeters(double in) { return in * 0.0254; }
    public static double convertInchesToCm(double in) { return in * 2.54; }

    public static void main(String[] args) {
        System.out.println("1 yard = " + convertYardsToFeet(1) + " feet");
        System.out.println("100 inches = " + convertInchesToCm(100) + " cm");
    }
}

