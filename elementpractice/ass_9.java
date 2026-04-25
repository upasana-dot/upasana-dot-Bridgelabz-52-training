import java.util.*;
public class ass_9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float fee = sc.nextInt();
        float dispercent = sc.nextInt();
        float discount = (fee*dispercent)/100;
        System.out.println(" The  discount amount in INR "+discount+" and final discounted fee is INR " + (fee-discount));
        
    }
    
}
