package level_3;
import java.util.*;

public class NumberChecker2 {

    // 1. Count digits
    public static int countDigits(int number) {
        return Integer.toString(Math.abs(number)).length();
    }

    // 2. Store digits in an array
    public static int[] getDigits(int number) {
        String numStr = Integer.toString(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) digits[i] = numStr.charAt(i) - '0';
        return digits;
    }

    // 3. Check Duck number
    public static boolean isDuckNumber(int number) {
        int[] digits = getDigits(number);
        for (int d : digits) if (d != 0) return true;
        return false;
    }

    // 4. Check Armstrong number
    public static boolean isArmstrong(int number) {
        int[] digits = getDigits(number);
        int n = digits.length, sum = 0;
        for (int d : digits) sum += Math.pow(d, n);
        return sum == number;
    }

    // 5. Largest and second largest digit
    public static int[] largestAndSecondLargest(int number) {
        int[] digits = getDigits(number);
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) secondLargest = d;
        }
        return new int[]{largest, secondLargest};
    }

    // 6. Smallest and second smallest digit
    public static int[] smallestAndSecondSmallest(int number) {
        int[] digits = getDigits(number);
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) secondSmallest = d;
        }
        return new int[]{smallest, secondSmallest};
    }

    // 7. Sum of digits
    public static int sumDigits(int number) {
        int sum = 0;
        for (int d : getDigits(number)) sum += d;
        return sum;
    }

    // 8. Sum of squares of digits
    public static int sumSquaresDigits(int number) {
        int sum = 0;
        for (int d : getDigits(number)) sum += Math.pow(d, 2);
        return sum;
    }

    // 9. Check Harshad number
    public static boolean isHarshad(int number) {
        int sum = sumDigits(number);
        return sum != 0 && number % sum == 0;
    }

    // 10. Frequency of digits
    public static int[][] digitFrequency(int number) {
        int[] digits = getDigits(number);
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) freq[i][0] = i;
        for (int d : digits) freq[d][1]++;
        return freq;
    }

    // 11. Reverse digits
    public static int[] reverseDigits(int number) {
        int[] digits = getDigits(number);
        int left = 0, right = digits.length - 1;
        while (left < right) {
            int temp = digits[left];
            digits[left] = digits[right];
            digits[right] = temp;
            left++; right--;
        }
        return digits;
    }

    // 12. Check palindrome
    public static boolean isPalindrome(int number) {
        return Arrays.equals(getDigits(number), reverseDigits(number));
    }

    // 13. Prime number
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) if (number % i == 0) return false;
        return true;
    }

    // 14. Neon number
    public static boolean isNeon(int number) {
        int square = number * number, sum = 0;
        for (int d : getDigits(square)) sum += d;
        return sum == number;
    }

    // 15. Spy number
    public static boolean isSpy(int number) {
        int sum = 0, prod = 1;
        for (int d : getDigits(number)) {
            sum += d;
            prod *= d;
        }
        return sum == prod;
    }

    // 16. Automorphic number
    public static boolean isAutomorphic(int number) {
        int sq = number * number;
        return Integer.toString(sq).endsWith(Integer.toString(number));
    }

    // 17. Buzz number
    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    // 18. Perfect number
    public static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) if (number % i == 0) sum += i;
        return sum == number;
    }

    // 19. Abundant number
    public static boolean isAbundant(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) if (number % i == 0) sum += i;
        return sum > number;
    }

    // 20. Deficient number
    public static boolean isDeficient(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) if (number % i == 0) sum += i;
        return sum < number;
    }

    // 21. Strong number
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }

    public static boolean isStrong(int number) {
        int sum = 0;
        for (int d : getDigits(number)) sum += factorial(d);
        return sum == number;
    }

    // Main method to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Count digits: " + countDigits(num));
        System.out.println("Digits: " + Arrays.toString(getDigits(num)));
        System.out.println("Duck number: " + isDuckNumber(num));
        System.out.println("Armstrong: " + isArmstrong(num));
        System.out.println("Largest & 2nd largest: " + Arrays.toString(largestAndSecondLargest(num)));
        System.out.println("Smallest & 2nd smallest: " + Arrays.toString(smallestAndSecondSmallest(num)));
        System.out.println("Sum digits: " + sumDigits(num));
        System.out.println("Sum squares: " + sumSquaresDigits(num));
        System.out.println("Harshad: " + isHarshad(num));
        System.out.println("Digit frequency: " + Arrays.deepToString(digitFrequency(num)));
        System.out.println("Reversed digits: " + Arrays.toString(reverseDigits(num)));
        System.out.println("Palindrome: " + isPalindrome(num));
        System.out.println("Prime: " + isPrime(num));
        System.out.println("Neon: " + isNeon(num));
        System.out.println("Spy: " + isSpy(num));
        System.out.println("Automorphic: " + isAutomorphic(num));
        System.out.println("Buzz: " + isBuzz(num));
        System.out.println("Perfect: " + isPerfect(num));
        System.out.println("Abundant: " + isAbundant(num));
        System.out.println("Deficient: " + isDeficient(num));
        System.out.println("Strong: " + isStrong(num));
    }
}
