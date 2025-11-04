public class Q4 {
    public static void main(String[] args) {
        String str = "45.89";

        Double d = Double.parseDouble(str);
        System.out.println("Double value: " + d);

        int intValue = d.intValue();
        System.out.println("Integer value: " + intValue);
    }
}

