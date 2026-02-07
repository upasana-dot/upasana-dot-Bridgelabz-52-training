package ArrayandString.array;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 4, 4, 5};
        int n = nums.length;
        int j = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        for (int i = 0; i <= j; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    
}
