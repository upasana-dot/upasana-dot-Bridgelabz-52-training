package level_2;
import java.util.*;

public class Friends {
    public static int findYoungest(int[] ages) {
        int idx = 0;
        for (int i = 1; i < ages.length; i++) if (ages[i] < ages[idx]) idx = i;
        return idx;
    }
    public static int findTallest(int[] heights) {
        int idx = 0;
        for (int i = 1; i < heights.length; i++) if (heights[i] > heights[idx]) idx = i;
        return idx;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[3], heights = new int[3];
        String[] names = {"Amar", "Akbar", "Anthony"};
        for (int i = 0; i < 3; i++) {
            ages[i] = sc.nextInt();
            heights[i] = sc.nextInt();
        }
        System.out.println("Youngest: " + names[findYoungest(ages)]);
        System.out.println("Tallest: " + names[findTallest(heights)]);
    }
}
