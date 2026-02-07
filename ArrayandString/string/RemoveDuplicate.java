package ArrayandString.string;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "aabbcc";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || str.charAt(i) != str.charAt(i - 1)) {
                result.append(str.charAt(i));
            }
        }
        System.out.println(result.toString());
    }
    
}
