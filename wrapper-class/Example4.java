public class Example4 {
    public static void main(String[] args) {
        String str = "45.89";
        Double d = Double.parseDouble(str);
        int intVal = d.intValue();
        System.out.println("Integer value: " + intVal);
    }
}
