import java.util.*;

public class SocialNetwork {
    static class Graph {
        Map<String, List<String>> adj = new HashMap<>();

        void addEdge(String u, String v) {
            adj.putIfAbsent(u, new ArrayList<>());
            adj.putIfAbsent(v, new ArrayList<>());

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        void findFriends(String user) {
            System.out.println("Friends of " + user + ": " + adj.get(user));
        }

        void isDirectlyConnected(String u, String v) {
            if (adj.get(u).contains(v))
                System.out.println("Yes, directly connected");
            else
                System.out.println("No, not directly connected");
        }

        void shortestPath(String start, String end) {
            Queue<String> q = new LinkedList<>();
            Map<String, String> parent = new HashMap<>();
            Set<String> visited = new HashSet<>();

            q.add(start);
            visited.add(start);

            while (!q.isEmpty()) {
                String curr = q.poll();

                for (String neighbor : adj.get(curr)) {
                    if (!visited.contains(neighbor)) {
                        visited.add(neighbor);
                        parent.put(neighbor, curr);
                        q.add(neighbor);
                    }
                }
            }

            List<String> path = new ArrayList<>();
            String temp = end;

            while (temp != null) {
                path.add(temp);
                temp = parent.get(temp);
            }

            Collections.reverse(path);
            System.out.println("Shortest Path: " + path);
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph();

        g.addEdge("Alice", "Bob");
        g.addEdge("Alice", "Charlie");
        g.addEdge("Bob", "David");
        g.addEdge("Charlie", "Eve");
        g.addEdge("David", "Eve");

        g.findFriends("Alice");
        g.isDirectlyConnected("Bob", "Eve");
        g.shortestPath("Alice", "Eve");
    }
}