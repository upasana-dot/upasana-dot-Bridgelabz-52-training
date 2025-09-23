import java.util.*;
public class leapyear2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year= sc.nextInt();
        if((year%400==0 && year%100!=0) || year%4==0){
            System.err.println("leap year");
        }else{
            System.out.println("not a leap year");
        }
    }
    
}
