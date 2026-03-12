package Recursion_Backtracking;
import java.util.*;
public class FactorialRecursion {
    public static int factorial(int n){

        if(n == 0 || n == 1){   
            return 1;
        }
        return n * factorial(n - 1);   // recursive case
    }
    public static void main(String[] args){
        int n = 5;
        int result = factorial(n);
        System.out.println("Factorial = " + result);
    }
}