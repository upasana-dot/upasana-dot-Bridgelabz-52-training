package level_2;
import java.util.Scanner;

public class ques_9 {

    public static String getComputerChoice() {
        int val = (int)(Math.random() * 3);
        if (val == 0) return "rock";
        else if (val == 1) return "paper";
        else return "scissors";
    }

    public static String findWinner(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("paper") && comp.equals("rock")) ||
            (user.equals("scissors") && comp.equals("paper"))) {
            return "User";
        } else {
            return "Computer";
        }
    }

    public static String[][] calculateStats(int userWins, int compWins, int games) {
        String[][] stats = new String[2][3];
        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f", (userWins * 100.0) / games);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = String.format("%.2f", (compWins * 100.0) / games);

        return stats;
    }

    public static void displayStats(String[][] stats) {
        System.out.println("Player\tWins\tWin%");
        for (String[] row : stats) {
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int games = sc.nextInt();

        int userWins = 0, compWins = 0;

        for (int i = 1; i <= games; i++) {
            System.out.print("Game " + i + " - Enter rock/paper/scissors: ");
            String user = sc.next().toLowerCase();
            String comp = getComputerChoice();

            String winner = findWinner(user, comp);
            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;

            System.out.println("Computer chose: " + comp + " → Winner: " + winner);
        }

        String[][] stats = calculateStats(userWins, compWins, games);
        displayStats(stats);
    }
}

