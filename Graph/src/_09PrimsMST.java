import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class _09PrimsMST {
    static class Pair {
        int node;
        int wt;
        public Pair(int node, int wt) {
            this.node = node;
            this.wt = wt;
        }
    }

    static void prims(List<List<Pair>> adjList, int V) {
        boolean[] visited = new boolean[V];
        int[] parent = new int[V];   // to store MST edges
        int[] key = new int[V];      // min weight edge to each node

        for (int i = 0; i < V; i++) {
            key[i] = Integer.MAX_VALUE;
            parent[i] = -1;
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.wt - b.wt);

        key[0] = 0; // start from node 0
        pq.offer(new Pair(0, 0));

        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            int u = curr.node;

            if (visited[u]) continue;
            visited[u] = true;

            for (Pair neighbor : adjList.get(u)) {
                int v = neighbor.node;
                int weight = neighbor.wt;

                if (!visited[v] && weight < key[v]) {
                    key[v] = weight;
                    parent[v] = u; // store edge u-v
                    pq.offer(new Pair(v, key[v]));
                }
            }
        }

        // Print MST edges and total weight
        int mstWeight = 0;
        System.out.println("Edges in MST:");
        for (int i = 1; i < V; i++) { // start from 1 because 0 is root
            System.out.println(parent[i] + " - " + i + " (wt = " + key[i] + ")");
            mstWeight += key[i];
        }
        System.out.println("Total weight of MST = " + mstWeight);
    }

    public static void main(String[] args) {
        int V = 5;
        List<List<Pair>> adjList = new ArrayList<>();
        for (int i = 0; i < V; i++) adjList.add(new ArrayList<>());

        // Undirected graph (add both directions)
        adjList.get(0).add(new Pair(1, 2));
        adjList.get(1).add(new Pair(0, 2));

        adjList.get(0).add(new Pair(3, 6));
        adjList.get(3).add(new Pair(0, 6));

        adjList.get(1).add(new Pair(2, 3));
        adjList.get(2).add(new Pair(1, 3));

        adjList.get(1).add(new Pair(3, 8));
        adjList.get(3).add(new Pair(1, 8));

        adjList.get(1).add(new Pair(4, 5));
        adjList.get(4).add(new Pair(1, 5));

        adjList.get(2).add(new Pair(4, 7));
        adjList.get(4).add(new Pair(2, 7));

        prims(adjList, V);
    }
}
