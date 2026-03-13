package Stack;

import java.util.Stack;

public class RevString {
    public static void main(String[] args) {

        String str = "HELLO";

        Stack<Character> stack = new Stack<>();

        // Push characters
        for(int i = 0; i < str.length(); i++){
            stack.push(str.charAt(i));
        }

        String reverse = "";

        // Pop characters
        while(!stack.isEmpty()){
            reverse += stack.pop();
        }

        System.out.println("Reversed String = " + reverse);
    }
}
