package Stack.Quene;
import java.util.Deque;
import java.util.LinkedList;
public class SlidingWindowMaximumDeque {
    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] result = maxSlidingWindow(arr, k);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k <= 0) {
            return new int[0];
        }
        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {
            // Remove indices that are out of the current window
            while (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }
            // Remove indices whose corresponding values are less than nums[i]
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            // Add current index to the deque
            deque.offer(i);
            // The front of the deque is the largest element in the current window
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peek()];
            }
        }
        return result;
    }
    
}
