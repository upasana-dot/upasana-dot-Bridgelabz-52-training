import java.util.*;
public class ques_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        int n3= sc.nextInt();
        if(n1<n2 && n1<n3){
            System.out.printf("Is the first number the smallest? YES");
        }else{
            System.out.printf("Is the first number the smallest? NO");

        }

    }
    
}
