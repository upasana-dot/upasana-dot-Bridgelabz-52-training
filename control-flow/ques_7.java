import java.util.*;
public class ques_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        if((3<=month && month <=6) && (20<day && day<31) ){
            System.out.println("spring season");
        }else{
            System.out.println("no spring season");
        }

    }
    
}
