package Stack;
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Stack;

public class infixTopostfix {

    static int pre(char ch) {
        if (ch == '+' || ch == '-') return 1;
        if (ch == '*' || ch == '/') return 2;
        return -1;
    }
    static String infixToPostfix(String exp) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            }
            // If '(', push to stack
            else if (c == '(') {
                stack.push(c);
            }
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();
            }
            //operator
            else {
                while (!stack.isEmpty() && pre(c) <= pre(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }

    
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String expression = "f+a*b*c*d+e";
        System.out.println("Postfix: " + infixToPostfix(expression));
    }
}
