import java.util.Arrays;

public class _08FlyWarshal {
    private static int INF = 1000000;
    private static void floydWarshall(int[][] graph, int V){
        int[][] dist = new int[V][V];
        // Initialize distance matrix
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                dist[i][j] = graph[i][j];
            }
        }
        for(int k =0;k<V;k++){
            for(int i=0;i<V;i++){
                for(int j =0;j<V;j++){
                    if (dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }

        // Print shortest distances
        System.out.println("Shortest distances between all pairs:");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (dist[i][j] == INF)
                    System.out.print("INF ");
                else
                    System.out.print(dist[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int INF = 1000000;
        int V =4;
        int[][] graph = {
                {0, 3, INF, 7},
                {8, 0, 2, INF},
                {5, INF, 0, 1},
                {2, INF, INF, 0}
        };
        floydWarshall(graph,V);
    }
}
