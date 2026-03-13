package Stack;

import java.util.Stack;

public class maxElement {
    public static void main(String[] args) {

        int[] arr = {4, 7, 2, 9, 5};

        Stack<Integer> stack = new Stack<>();

        // Push all elements into stack
        for(int i = 0; i < arr.length; i++){
            stack.push(arr[i]);
        }

        int max = stack.pop();

        // Compare remaining elements
        while(!stack.isEmpty()){

            int temp = stack.pop();

            if(temp > max){
                max = temp;
            }
        }

        System.out.println("Maximum Element = " + max);
    }
    
}
