import java.util.function.Function;
public class StringLengthChecker{
    public static void main(String[] args) {
        Function<String, Integer> stringLength = str -> str.length();

        String testString = "Hello, World!";
        int length = stringLength.apply(testString);

        System.out.println("The length of the string \"" + testString + "\" is: " + length);
    }
}
