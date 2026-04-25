package level_3;
import java.util.*;

public class FootballTeam {
    
    public static int sumHeights(int[] heights) {
        int sum = 0;
        for (int h : heights) sum += h;
        return sum;
    }

    public static double meanHeight(int[] heights) {
        return sumHeights(heights) / (double) heights.length;
    }

    public static int shortestHeight(int[] heights) {
        int min = heights[0];
        for (int h : heights) if (h < min) min = h;
        return min;
    }

    public static int tallestHeight(int[] heights) {
        int max = heights[0];
        for (int h : heights) if (h > max) max = h;
        return max;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();
        for (int i = 0; i < 11; i++) {
            heights[i] = 150 + rand.nextInt(101); // 150 to 250 cm
        }

        System.out.println("Heights of players: " + Arrays.toString(heights));
        System.out.println("Shortest: " + shortestHeight(heights));
        System.out.println("Tallest: " + tallestHeight(heights));
        System.out.println("Mean: " + meanHeight(heights));
    }
}

