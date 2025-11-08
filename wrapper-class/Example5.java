public class Example5 {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;

        System.out.println(a == b);      // true (cached range -128 to 127)
        System.out.println(c == d);      // false (outside cache)
        System.out.println(a.equals(b)); // true (value comparison)
    }
}

