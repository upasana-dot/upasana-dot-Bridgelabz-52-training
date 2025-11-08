import java.util.*;

public class Example8 {
    public static void main(String[] args) {
        ArrayList<Character> chars = new ArrayList<>();
        chars.add('A');
        chars.add('3');
        chars.add('b');

        for (char c : chars) {
            if (Character.isDigit(c))
                System.out.println(c + " is a digit");
            else if (Character.isLetter(c))
                System.out.println(c + " is an alphabet");
            else
                System.out.println(c + " is neither digit nor alphabet");
        }
    }
}
