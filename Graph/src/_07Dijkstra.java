import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class _07Dijkstra {
    public static class Pair{
        int node;
        int wt;
        public Pair(int node, int wt){
            this.node = node;
            this.wt = wt;
        }
    }
    private static void dijkstra(List<List<Pair>> adj, int V,int src){
        int[] dist = new int[V];//for the distance
        Arrays.fill(dist,Integer.MAX_VALUE);
        PriorityQueue<int[]> pq = new PriorityQueue<>( (a, b) -> a[1] - b[1] );// pick min among all the adjacent

        //src to pq
        dist[src] =0;
        pq.offer(new int[]{src,0});

        while(!pq.isEmpty()) {
            int[] curr = pq.poll();
            int u = curr[0];
            int wt = curr[1];
            for (Pair neighbor : adj.get(u)) {
                Pair nc = neighbor;
                int v = nc.node;
                int nwt = nc.wt;
                //relaxation
                if (dist[u] + nwt < dist[v]) {
                    dist[v] = dist[u] + nwt;
                    pq.offer(new int[]{v, dist[v]});
                }
            }
        }
        // Print shortest distances
        System.out.println("Shortest distances from node " + src + ":");
        for (int i = 0; i < V; i++) {
            System.out.println("Node " + i + " : " + dist[i]);
        }
    }

    public static void main(String[] args) {
        int V = 5; // number of vertices
        List<List<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Add edges (undirected or directed as needed)
        // Example directed graph:
        adj.get(0).add(new Pair(1, 2));
        adj.get(0).add(new Pair(2, 4));
        adj.get(1).add(new Pair(2, 1));
        adj.get(1).add(new Pair(3, 7));
        adj.get(2).add(new Pair(4, 3));
        adj.get(3).add(new Pair(4, 1));

        int source = 0;
        dijkstra(adj, V, source);
    }
}
