import java.util.*;

public class Q8 {
    public static void main(String[] args) {
        ArrayList<Character> chars = new ArrayList<>();
        chars.add('A');
        chars.add('1');
        chars.add('b');
        chars.add('@');
        chars.add('Z');

        for (Character c : chars) {
            if (Character.isDigit(c))
                System.out.println(c + " is a Digit");
            else if (Character.isLetter(c))
                System.out.println(c + " is an Alphabet");
            else
                System.out.println(c + " is neither Digit nor Alphabet");
        }
    }
}

