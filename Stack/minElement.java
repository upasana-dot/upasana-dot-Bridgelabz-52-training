package Stack;

import java.util.Stack;

public class minElement {
    public static void main(String[] args) {

        int[] arr = {8, 3, 6, 1, 9};

        Stack<Integer> stack = new Stack<>();

        // Push elements into stack
        for(int i = 0; i < arr.length; i++){
            stack.push(arr[i]);
        }

        int min = stack.pop();

        // Compare remaining elements
        while(!stack.isEmpty()){

            int temp = stack.pop();

            if(temp < min){
                min = temp;
            }
        }

        System.out.println("Minimum Element = " + min);
    }
    
}
