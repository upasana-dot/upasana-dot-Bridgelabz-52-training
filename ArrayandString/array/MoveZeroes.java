package ArrayandString.array;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        int n = nums.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        for (int i = j; i < n; i++) {
            nums[i] = 0;
        }
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    
}
