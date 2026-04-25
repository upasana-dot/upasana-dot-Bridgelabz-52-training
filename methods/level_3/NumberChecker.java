package level_3;
import java.util.*;

import java.util.*;

public class NumberChecker {

    public static int countDigits(int number) {
        return Integer.toString(Math.abs(number)).length();
    }

    public static int[] getDigits(int number) {
        String numStr = Integer.toString(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) digits[i] = numStr.charAt(i) - '0';
        return digits;
    }

    public static boolean isDuckNumber(int number) {
        int[] digits = getDigits(number);
        for (int d : digits) if (d != 0) return true;
        return false;
    }

    public static boolean isArmstrong(int number) {
        int[] digits = getDigits(number);
        int n = digits.length, sum = 0;
        for (int d : digits) sum += Math.pow(d, n);
        return sum == number;
    }

    public static int[] largestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) secondLargest = d;
        }
        return new int[]{largest, secondLargest};
    }

    public static int[] smallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) secondSmallest = d;
        }
        return new int[]{smallest, secondSmallest};
    }

    // Sum and sum of squares of digits
    public static int sumDigits(int number) {
        int sum = 0;
        for (int d : getDigits(number)) sum += d;
        return sum;
    }

    public static int sumSquaresDigits(int number) {
        int sum = 0;
        for (int d : getDigits(number)) sum += Math.pow(d, 2);
        return sum;
    }

    // Harshad number
    public static boolean isHarshad(int number) {
        int sum = sumDigits(number);
        return sum != 0 && number % sum == 0;
    }

    // Frequency of digits
    public static int[][] digitFrequency(int number) {
        int[] digits = getDigits(number);
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) freq[i][0] = i;
        for (int d : digits) freq[d][1]++;
        return freq;
    }

    // Reverse digits array
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

    // Check palindrome
    public static boolean isPalindrome(int number) {
        int[] original = getDigits(number);
        int[] reversed = reverseDigits(number);
        return Arrays.equals(original, reversed);
    }

    // Prime number
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) if (number % i == 0) return false;
        return true;
    }

    // Neon number
    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;
        for (int d : getDigits(square)) sum += d;
        return sum == number;
    }

    // Spy number
    public static boolean isSpy(int number) {
        int sum = 0, prod = 1;
        for (int d : getDigits(number)) {
            sum += d;
            prod *= d;
        }
        return sum == prod;
    }

    // Automorphic number
    public static boolean isAutomorphic(int number) {
        int sq = number * number;
        String numStr = Integer.toString(number);
        String sqStr = Integer.toString(sq);
        return sqStr.endsWith(numStr);
    }

    // Buzz number
    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    // Perfect, Abundant, Deficient
    public static int sumProperDivisors(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) if (number % i == 0) sum += i;
        return sum;
    }

    public static boolean isPerfect(int number) {
        return number == sumProperDivisors(number);
    }

    public static boolean isAbundant(int number) {
        return number < sumProperDivisors(number);
    }

    public static boolean isDeficient(int number) {
        return number > sumProperDivisors(number);
    }

    // Strong number
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) f *= i;
        return f;
    }

    public static boolean isStrong(int number) {
        int sum = 0;
        for (int d : getDigits(number)) sum += factorial(d);
        return sum == number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println("Digits count: " + countDigits(number));
        System.out.println("Digits array: " + Arrays.toString(getDigits(number)));
        System.out.println("Is Duck Number? " + isDuckNumber(number));
        System.out.println("Is Armstrong? " + isArmstrong(number));
        System.out.println("Largest & Second Largest: " + Arrays.toString(largestAndSecondLargest(getDigits(number))));
        System.out.println("Smallest & Second Smallest: " + Arrays.toString(smallestAndSecondSmallest(getDigits(number))));
        System.out.println("Sum of digits: " + sumDigits(number));
        System.out.println("Sum of squares: " + sumSquaresDigits(number));
        System.out.println("Harshad Number? " + isHarshad(number));
        System.out.println("Digit frequency: " + Arrays.deepToString(digitFrequency(number)));
        System.out.println("Reversed digits: " + Arrays.toString(reverseDigits(number)));
        System.out.println("Palindrome? " + isPalindrome(number));
        System.out.println("Prime? " + isPrime(number));
        System.out.println("Neon? " + isNeon(number));
        System.out.println("Spy? " + isSpy(number));
        System.out.println("Automorphic? " + isAutomorphic(number));
        System.out.println("Buzz? " + isBuzz(number));
        System.out.println("Perfect? " + isPerfect(number));
        System.out.println("Abundant? " + isAbundant(number));
        System.out.println("Deficient? " + isDeficient(number));
        System.out.println("Strong? " + isStrong(number));
    }
}
