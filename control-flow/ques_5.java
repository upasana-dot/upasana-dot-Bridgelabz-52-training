import java.util.*;
public class ques_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=18){
            System.out.printf("The person's age is %d and can vote",n);
        }else{
            System.out.printf("The person's age is %d and cannot vote",n);
        }
    }
    
}
