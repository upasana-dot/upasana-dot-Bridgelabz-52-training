package ArrayandString.string;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello World";
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        System.out.println(reversed.toString());
    }
    
}
