package GRAPH;

import java.util.*;

public class city_road {

    static class Edge {
        String dest;
        int weight;

        Edge(String dest, int weight) {
            this.dest = dest;
            this.weight = weight;
        }
    }

    static class Graph {
        Map<String, List<Edge>> adj = new HashMap<>();

        void addEdge(String u, String v, int w, boolean bidirectional) {
            adj.putIfAbsent(u, new ArrayList<>());
            adj.get(u).add(new Edge(v, w));

            if (bidirectional) {
                adj.putIfAbsent(v, new ArrayList<>());
                adj.get(v).add(new Edge(u, w));
            }
        }

        void bfs(String start) {
            Queue<String> q = new LinkedList<>();
            Set<String> visited = new HashSet<>();

            q.add(start);
            visited.add(start);

            while (!q.isEmpty()) {
                String curr = q.poll();
                System.out.print(curr + " ");

                for (Edge e : adj.getOrDefault(curr, new ArrayList<>())) {
                    if (!visited.contains(e.dest)) {
                        visited.add(e.dest);
                        q.add(e.dest);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph();

        g.addEdge("A", "B", 5, false);
        g.addEdge("B", "C", 3, true);
        g.addEdge("A", "D", 7, true);
        g.addEdge("D", "E", 2, false);
        g.addEdge("C", "E", 4, false);

        System.out.println("Reachable from A:");
        g.bfs("A");
    }
}
