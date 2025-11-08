

public class Example9 {
    
    public static void main(String[] args) {
        String str = "100.55";
        try {
            Float f = Float.valueOf(str);
            System.out.println("Float value: " + f);
        } catch (NumberFormatException e) {
            System.out.println("Invalid float format!");
        }
    }
}
