package GRAPH;
import java.util.*;
public class course_prerequisite {
    static class Graph {
        Map<String, List<String>> adj = new HashMap<>();

        void addEdge(String u, String v) {
            adj.putIfAbsent(u, new ArrayList<>());
            adj.get(u).add(v);
        }

        boolean dfsCycle(String node, Set<String> visited,
                         Set<String> recStack) {

            visited.add(node);
            recStack.add(node);

            for (String neighbor : adj.getOrDefault(node, new ArrayList<>())) {

                if (!visited.contains(neighbor)) {
                    if (dfsCycle(neighbor, visited, recStack))
                        return true;
                }
                else if (recStack.contains(neighbor)) {
                    return true;
                }
            }

            recStack.remove(node);
            return false;
        }

        void detectCycle() {
            Set<String> visited = new HashSet<>();
            Set<String> recStack = new HashSet<>();

            for (String node : adj.keySet()) {
                if (!visited.contains(node)) {
                    if (dfsCycle(node, visited, recStack)) {
                        System.out.println("Cycle Found");
                        return;
                    }
                }
            }

            System.out.println("No Cycle");
        }

        void topologicalSort() {
            Map<String, Integer> indegree = new HashMap<>();

            for (String node : adj.keySet()) {
                indegree.putIfAbsent(node, 0);

                for (String neighbor : adj.get(node)) {
                    indegree.put(neighbor,
                            indegree.getOrDefault(neighbor, 0) + 1);
                }
            }

            Queue<String> q = new LinkedList<>();

            for (String node : indegree.keySet()) {
                if (indegree.get(node) == 0)
                    q.add(node);
            }

            System.out.println("Topological Order:");

            while (!q.isEmpty()) {
                String curr = q.poll();
                System.out.print(curr + " ");

                for (String neighbor : adj.getOrDefault(curr,
                        new ArrayList<>())) {

                    indegree.put(neighbor,
                            indegree.get(neighbor) - 1);

                    if (indegree.get(neighbor) == 0)
                        q.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph();

        g.addEdge("CS101", "CS102");
        g.addEdge("CS101", "CS201");
        g.addEdge("CS102", "CS202");
        g.addEdge("MATH101", "CS201");

        g.detectCycle();
        g.topologicalSort();
    }
}