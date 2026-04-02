package Stack;
import java.util.*;

class Solution {
    public int postfix_evaluation(String exp) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            // If operand (digit)
            if (Character.isDigit(ch)) {
                stack.push(ch - '0');   // convert char to int
            } 
            // If operator
            else {
                int b = stack.pop();
                int a = stack.pop();

                switch (ch) {
                    case '+': stack.push(a + b); break;
                    case '-': stack.push(a - b); break;
                    case '*': stack.push(a * b); break;
                    case '/': stack.push(a / b); break;
                }
            }
        }

        return stack.pop();
    }
    public static void main(String[] args) {
        Solution obj = new Solution();

        String exp = "23*54*+9-";   
        int result = obj.postfix_evaluation(exp);  
        System.out.println("Output: " + result);
    }

}
