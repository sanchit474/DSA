import java.util.ArrayList;
import java.util.List;

public class _02GraphRep {
    // Pair class for weighted graph
//    class Pair {
//        int node;
//        int weight;
//
//        public Pair(int node, int weight) {
//            this.node = node;
//            this.weight = weight;
//        }
//    }


    List<List<Integer>> adjList;
//    List<List<Pair>> adjListW;

    public _02GraphRep(int node) {


        // Unweighted list init
        adjList = new ArrayList<>();
        for (int i = 0; i < node; i++) {
            adjList.add(new ArrayList<>());
        }
//
//        // Weighted list init
//        adjListW = new ArrayList<>();
//        for (int i = 0; i < node; i++) {
//            adjListW.add(new ArrayList<>());
//        }
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

//    public void addEdgesWeightedList(int[][] edges, boolean isDirected) {
//        for (int[] edge : edges) {
//            int u = edge[0];
//            int v = edge[1];
//            int w = edge[2];
//
//            adjListW.get(u).add(new Pair(v, w));
//            if (!isDirected) {
//                adjListW.get(v).add(new Pair(u, w));  // FIXED
//            }
//        }
//    }

//    public void printWeightedList() {
//        for (int i = 0; i < adjListW.size(); i++) {
//            System.out.print(i + " -> ");
//            for (Pair p : adjListW.get(i)) {
//                System.out.print("(" + p.node + ", w=" + p.weight + ") ");
//            }
//            System.out.println();
//        }
//    }

    public static void main(String[] args) {
        int[][] edges = { {0, 2}, {0, 1}, {1, 3} };
        int node = 4;

        System.out.println("Undirected Graph (Unweighted):");
        _02GraphRep graph = new _02GraphRep(node);
        graph.addEdgesList(edges, false);
        graph.printList();

//        System.out.println("\nUndirected Graph (Weighted):");
//        int[][] edgesW = { {0, 2, 20}, {0, 1, 10}, {1, 3, 30} };
//        _02GraphRep graphW = new _02GraphRep(node);
//        graphW.addEdgesWeightedList(edgesW, false);
//        graphW.printWeightedList();
    }
}
