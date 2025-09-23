public class ass_7 {
    public static void main(String[] args) {
        double pi = 3.14;
        int radiuskm = 6378;
        double volume_in_km= (4/3)* pi* radiuskm*radiuskm*radiuskm;
        double volume_in_miles=volume_in_km*1.6;

        System.out.println("The volume of earth in cubic kilometers is "+volume_in_km+" and cubic miles is "+volume_in_miles );

    }
    
}
