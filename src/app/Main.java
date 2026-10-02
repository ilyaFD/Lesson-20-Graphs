package app;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(5);

        graph.addVertex();
        graph.addVertex();
        graph.addVertex();

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(1, 7);
        graph.addEdge(2, 4);
        graph.addEdge(2, 5);
        graph.addEdge(2, 6);

        System.out.println("Print result graph");
        graph.printGraph();

        System.out.println("\nPrint exist hasVertex");
        System.out.println("Vertex 0 exists: " + graph.hasVertex(0));
        System.out.println("Vertex 7 exists: " + graph.hasVertex(7));

        System.out.println("\nPrint exist edge");
        System.out.println("Edge 0 -> 1 exists: " + graph.hasEdge(0, 1));
        System.out.println("Edge 0 -> 3 exists: " + graph.hasEdge(0, 3));
        System.out.println("Edge 2 -> 6 exists: " + graph.hasEdge(2, 6));

        graph.removeEdge(1, 7);

        System.out.println("\nPrint result graph after removeEdge(1, 7)");
        graph.printGraph();

        System.out.println("\nPrint not exist hasVertex");
        System.out.println("Vertex 7 exists: " + graph.hasVertex(7));
        System.out.println("Vertex 10 exists: " + graph.hasVertex(10));

        System.out.println("\nPrint not exist edge");
        System.out.println("Edge 1 -> 7 exists: " + graph.hasEdge(1, 7));
        System.out.println("Edge 0 -> 7 exists: " + graph.hasEdge(0, 7));
    }
}
