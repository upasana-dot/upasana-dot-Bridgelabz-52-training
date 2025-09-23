package level_3;
import java.util.*;

public class OTPGenerator {
    
    public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000);
    }

    public static boolean isUnique(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int n : arr) set.add(n);
        return set.size() == arr.length;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i = 0; i < 10; i++) otps[i] = generateOTP();
        System.out.println("Generated OTPs: " + Arrays.toString(otps));
        System.out.println("Are OTPs unique? " + isUnique(otps));
    }
}
