package GRAPH;

import java.util.*;

public class NetworkRouting {

    static class Graph {
        Map<String, List<String>> adj = new HashMap<>();

        void addEdge(String u, String v) {
            adj.putIfAbsent(u, new ArrayList<>());
            adj.putIfAbsent(v, new ArrayList<>());

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        void minimumHops(String start, String end) {

            Queue<String> q = new LinkedList<>();
            Map<String, Integer> distance = new HashMap<>();

            q.add(start);
            distance.put(start, 0);

            while (!q.isEmpty()) {

                String curr = q.poll();

                for (String neighbor : adj.get(curr)) {

                    if (!distance.containsKey(neighbor)) {
                        distance.put(neighbor,
                                distance.get(curr) + 1);

                        q.add(neighbor);
                    }
                }
            }

            System.out.println("Minimum Hops: "
                    + distance.get(end));
        }
    }

    public static void main(String[] args) {

        Graph g = new Graph();

        g.addEdge("R1", "R2");
        g.addEdge("R1", "R3");
        g.addEdge("R2", "R4");
        g.addEdge("R3", "R4");
        g.addEdge("R4", "R5");
        g.addEdge("R5", "R6");

        g.minimumHops("R1", "R6");
    }
}
