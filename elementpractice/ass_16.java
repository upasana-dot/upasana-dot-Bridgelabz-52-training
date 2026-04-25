import java.util.Scanner;

public class ass_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Formula
        int handshakes = (n * (n - 1)) / 2;

        // Output
        System.out.printf("The maximum number of handshakes among %d students is %d\n", n, handshakes);
    }
}

