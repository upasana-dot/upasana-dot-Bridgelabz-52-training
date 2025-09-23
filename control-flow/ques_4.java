import java.util.*;
public class ques_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int sum = 0;
        if (n>0){
            for(int i=0;i<=n;i++){
                sum+=i;
            }  
            System.out.printf("The sum of %d natural number is %d ",n,sum); 
        }else{
            System.out.printf("the number %d is not a natural number",n);
        } 
    }
    
}
