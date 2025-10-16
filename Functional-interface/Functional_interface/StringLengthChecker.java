import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {
        Function<String, Integer> getLength = msg -> msg.length();
        
        String message = "Welcome to Java Functional Interfaces!";
        System.out.println("Message length: " + getLength.apply(message));
    }
}
