public class Q7 {
    public static void main(String[] args) {
        int num = 50;
        Integer obj = Integer.valueOf(num);     // int → Integer
        String str = obj.toString();            // Integer → String
        Integer newObj = Integer.valueOf(str);  // String → Integer

        System.out.println("int: " + num);
        System.out.println("Integer: " + obj);
        System.out.println("String: " + str);
        System.out.println("Converted back Integer: " + newObj);
    }
}

