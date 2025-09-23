package level_1;
public class ques_5 {
    public static void main(String[] args) {
        int[] multiplicationResult = new int[40]; 
        int index = 0;

        for (int num = 6; num <= 9; num++) {
            for (int i = 1; i <= 10; i++) {
                multiplicationResult[index++] = num * i;
                System.out.println(num + " * " + i + " = " + (num * i));
            }
            
        }
    }
}

