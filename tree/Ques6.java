package tree;

import java.util.*;

class Ques6 {   // Evaluate Postfix Expression

    public int evaluate(String[] postfix){
        Stack<Integer> st = new Stack<>();

        for(String token : postfix){

            if(token.equals("+") || token.equals("-") ||
               token.equals("*") || token.equals("/")){

                int b = st.pop();
                int a = st.pop();

                if(token.equals("+")) st.push(a + b);
                else if(token.equals("-")) st.push(a - b);
                else if(token.equals("*")) st.push(a * b);
                else st.push(a / b);
            }
            else{
                st.push(Integer.parseInt(token));
            }
        }

        return st.pop();
    }
}
