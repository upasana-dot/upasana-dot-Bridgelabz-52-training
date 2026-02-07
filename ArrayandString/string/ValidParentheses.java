package ArrayandString.string;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "({[]})";
        if (s.length() % 2 != 0) {
            System.out.println("Not valid");
            return;
        }
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    System.out.println("Not valid");
                    return;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    System.out.println("Not valid");
                    return;
                }
            }
        }
        if (stack.isEmpty()) {
            System.out.println("Valid");
        } else {
            System.out.println("Not valid");
        }
    }
    
}
