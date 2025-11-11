package collection.real_world;
import java.util.*;

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name; this.score = score;
    }

    @Override
    public String toString() { return name + " (" + score + ")"; }
}

class Match {
    String teamA, teamB;
    Match(String a, String b) { this.teamA = a; this.teamB = b; }
    public String toString() { return teamA + " vs " + teamB; }
}

public class Q5 {
    public static void main(String[] args) {
        Set<Player> players = new HashSet<>();
        Queue<Match> matchQueue = new LinkedList<>();
        List<String> results = new ArrayList<>();
        TreeSet<Player> leaderboard = new TreeSet<>((a, b) -> b.score - a.score);

        players.add(new Player("Alice", 70));
        players.add(new Player("Bob", 85));
        players.add(new Player("Charlie", 90));

        matchQueue.offer(new Match("Alice", "Bob"));
        matchQueue.offer(new Match("Charlie", "Bob"));

        System.out.println("🎮 Matches:");
        matchQueue.forEach(System.out::println);

        while (!matchQueue.isEmpty()) {
            Match m = matchQueue.poll();
            results.add(m + " - Completed");
        }

        leaderboard.addAll(players);
        System.out.println("\n🏆 Leaderboard:");
        leaderboard.forEach(System.out::println);
    }
}

