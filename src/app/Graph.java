package app;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    private final List<List<Integer>> adjacencyList;

    private Boolean isValidEdgeInput(int source, int destination) {
        return isValidVertex(source) && isValidVertex(destination);
    }

    private Boolean isValidVertex(int vertex) {
        return vertex >= 0
                && vertex < adjacencyList.size()
                && adjacencyList.get(vertex) != null;
    }

    public Graph(int vertices) {
        adjacencyList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    public void addVertex() {
        adjacencyList.add(new ArrayList<>());
    }
    public void addEdge(int source, int destination) {
        if (this.isValidEdgeInput(source, destination)) {
            this.adjacencyList.get(source).add(destination);
        }
    }
    public void removeVertex(int vertex) {
        if (!isValidVertex(vertex)) {
            return;
        }

        adjacencyList.set(vertex, null);

        for (List<Integer> neighbors : adjacencyList) {
            if (neighbors != null) {
                neighbors.remove(Integer.valueOf(vertex));
            }
        }
    }
    public void removeEdge(int source, int destination) {
        if (this.isValidEdgeInput(source, destination)) {
            adjacencyList.get(source).remove(Integer.valueOf(destination));
        }
    }
    public Boolean hasVertex(int vertex) {
        return isValidVertex(vertex);

    }
    public Boolean hasEdge(int source, int destination) {
        if (!isValidEdgeInput(source, destination)) {
            return false;
        }

        return adjacencyList.get(source).contains(destination);

    }
    public void printGraph() {
        for (int vertex = 0; vertex < adjacencyList.size(); vertex++) {
            if (adjacencyList.get(vertex) == null) {
                System.out.println(vertex + " -> removed");
            } else {
                System.out.println(vertex + " -> " + adjacencyList.get(vertex));
            }
        }
    }

}
