package ArrayandString.array;

public class couneEvenOdd {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int evenCount = 0;
        int oddCount = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);
    }
    
}
