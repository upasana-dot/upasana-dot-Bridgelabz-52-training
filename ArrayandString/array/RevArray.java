package ArrayandString.array;

public class RevArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int n = nums.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[n - i - 1];
            nums[n - i - 1] = temp;
        }
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    
}
