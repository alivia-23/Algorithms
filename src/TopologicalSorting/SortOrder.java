package TopologicalSorting;

import java.util.*;

public class SortOrder {
    public static List<Integer> sort(int vertices, int[][] edges) {
        List<Integer> sortedOrder = new ArrayList<>();
        if (vertices <= 0) {
            return sortedOrder;
        }
        //Initialize a map to keep count of inDegrees of the vertices
        Map<Integer, Integer> inDegrees = new HashMap<>();

        // Initilize another map to keep the parent linked with its children
        Map<Integer, List<Integer>> adjacencyList = new HashMap<>();
        for (int i = 0; i < vertices; i++) {
            inDegrees.put(i, 0);
            adjacencyList.put(i, new ArrayList<>());
        }
        // Build the graph
        for (int i = 0; i < edges.length; i++) {
            int parent = edges[i][0];
            int child = edges[i][1];
            List<Integer> children = adjacencyList.get(parent);
            children.add(child);
            inDegrees.put(child, inDegrees.get(child) + 1);
        }

        // Find all sources
        Queue<Integer> sources = new LinkedList<>();
        for (Map.Entry<Integer, Integer> entry : inDegrees.entrySet()) {
            if (entry.getValue() == 0) {
                sources.add(entry.getKey());
            }
        }

        // For each source add it to the sorted order and subtract one from all of it's children's indegrees
        // if a child's in-degree becomes zero again add it to the sources queue
        while (!sources.isEmpty()) {
            int vertex = sources.poll();
            sortedOrder.add(vertex);

            // get the node's children to decrement their in-degrees
            List<Integer> children = adjacencyList.get(vertex);
            for (int child : children) {
                inDegrees.put(child, inDegrees.get(child) - 1);
                if (inDegrees.get(child) == 0) {
                    sources.add(child);
                }
            }
        }

        //if graph has a cycle then topological sort is not possible
        if (sortedOrder.size() != vertices) {
            return new ArrayList<>();
        }
        return sortedOrder;
    }

    public static void main(String[] args) {
        int vertices = 7;
        int[][] edges = {{6, 4}, {6, 2}, {5, 3}, {5, 4}, {3, 0}, {3, 1}, {3, 2}, {4, 1}};
        List<Integer> result = sort(vertices, edges);
        System.out.println(result); // result = [5, 6, 3, 4, 0, 2, 1]
    }
}
