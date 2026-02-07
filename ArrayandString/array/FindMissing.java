package ArrayandString.array;

public class FindMissing {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5};
        int n = nums.length + 1; // Total numbers should be n
        int totalSum = n * (n + 1) / 2; // Sum of first n natural numbers
        int arraySum = 0;
        for (int num : nums) {
            arraySum += num;
        }
        int missingNumber = totalSum - arraySum;
        System.out.println("Missing number: " + missingNumber);
    }
    
}
