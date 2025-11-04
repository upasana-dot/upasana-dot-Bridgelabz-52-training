import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a numeric string: ");
        String str = sc.nextLine();

        Integer num = Integer.parseInt(str);
        int square = num * num;

        System.out.println("Square value: " + square);
    }
}

