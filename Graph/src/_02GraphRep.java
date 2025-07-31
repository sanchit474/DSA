import java.util.ArrayList;
import java.util.List;

public class _02GraphRep {
    List<List<Integer>> adjList;
    public _02GraphRep(int node) {
        // Unweighted list init
        adjList = new ArrayList<>();
        for (int i = 0; i < node; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdgesList(int[][] edges, boolean isDirected) {
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adjList.get(u).add(v);
            if (!isDirected) {
                adjList.get(v).add(u);
            }
        }
    }

    public void printList() {
        for (int i = 0; i < adjList.size(); i++) {
            System.out.print(i + " -> ");
            for (int j = 0; j < adjList.get(i).size(); j++) {
                System.out.print(adjList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] edges = {{0, 2}, {0, 1}, {1, 3}};
        int node = 4;

        System.out.println("Undirected Graph (Unweighted):");
        _02GraphRep graph = new _02GraphRep(node);
        graph.addEdgesList(edges, false);
        graph.printList();

    }
}
