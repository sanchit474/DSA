public class _01GraphRep {
    int adjMatrix[][];

    public _01GraphRep(int node) {
        adjMatrix = new int[node][node];
    }

    public void addEdges(int[][] edges, boolean isDirected) {
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adjMatrix[u][v] = 1;
            if (!isDirected) {
                adjMatrix[v][u] = 1;
            }
        }
    }
    public void addEdgesWeighted(int[][] edges, boolean isDirected) {
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w= edge[2];
            adjMatrix[u][v] = w;
            if (!isDirected) {
                adjMatrix[v][u] = w;
            }
        }
    }

    public void printMatrix() {
        for (int i = 0; i < adjMatrix.length; i++) {
            System.out.print("row " + i + " -> ");
            for (int j = 0; j < adjMatrix[0].length; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] edges = { {0, 2}, {0, 1}, {1, 3} };
        int node = 4;

        System.out.println("Undirected Graph:");
        _01GraphRep undirectedGraph = new _01GraphRep(node);
        undirectedGraph.addEdges(edges, false);
        undirectedGraph.printMatrix();

        System.out.println("\nDirected Graph:");
        _01GraphRep directedGraph = new _01GraphRep(node);
        directedGraph.addEdges(edges, true);
        directedGraph.printMatrix();

        System.out.println("undirected weighted graph; ");
        int[][] edgesW = { {0, 2,20}, {0, 1,10}, {1, 3, 30} };
        _01GraphRep undirectedWeightedGraph = new _01GraphRep(node);
        undirectedWeightedGraph.addEdgesWeighted(edgesW, false);
        undirectedWeightedGraph.printMatrix();

        System.out.println("directed weighted graph; ");
        _01GraphRep directedWeightedGraph = new _01GraphRep(node);
        directedWeightedGraph.addEdgesWeighted(edgesW, true);
        directedWeightedGraph.printMatrix();


    }
}
