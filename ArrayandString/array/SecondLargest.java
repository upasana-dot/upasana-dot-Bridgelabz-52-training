package ArrayandString.array;

public class SecondLargest {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }
        System.out.println(secondMax);
    }
    
}
