package Recursion_Backtracking;

public class Arraysum {

        static int sum(int[] arr, int n){
    
            if(n == 0)     // base case
                return 0;
    
            return arr[n-1] + sum(arr, n-1);
        }
    
        public static void main(String[] args){
    
            int[] arr = {2,4,6,8,10};
    
            int result = sum(arr, arr.length);
    
            System.out.println("Sum = " + result);
        }
    }
