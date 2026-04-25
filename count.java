// count y distinct difference between two max elementy every sub array of given array
import java.util.HashSet;
import java.util.Set;
public class count {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int k = 2;
        int count = countDistinctMaxDifference(arr, k);
        System.out.println("Count of distinct differences: " + count);
    }

    public static int countDistinctMaxDifference(int[] arr, int k) {
        Set<Integer> distinctDifferences = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int max1 = Integer.MIN_VALUE;
                int max2 = Integer.MIN_VALUE;

                for (int m = i; m <= j; m++) {
                    if (arr[m] > max1) {
                        max2 = max1;
                        max1 = arr[m];
                    } else if (arr[m] > max2 && arr[m] != max1) {
                        max2 = arr[m];
                    }
                }

                if (max2 != Integer.MIN_VALUE) {
                    distinctDifferences.add(max1 - max2);
                }
            }
        }

        return distinctDifferences.size();
    }
    
}
