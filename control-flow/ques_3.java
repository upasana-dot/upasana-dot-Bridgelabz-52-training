/*#####################*/
import java.util.*;
public class ques_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        int n3= sc.nextInt();
        if (n1>n2 && n1>n3){
            System.out.printf("is the first number the largest? YES\n");
        }else if (n2>n1 && n2>n3){
            System.out.printf("is the second number the largest? YES\n");
        }else{
            System.out.printf("is the first number the largest? YES");
        }
    }
    
}
