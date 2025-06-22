import java.util.*;

public class DFSTraversal {
    public static void dfs(List<List<Integer>> adjList, int v, int src) {
        boolean[] visited = new boolean[v];
        Stack<Integer> st = new Stack<>();

        st.push(src);

        while (!st.isEmpty()) {
            int node = st.pop();

            if (!visited[node]) {
                visited[node] = true;
                System.out.print(node + " ");

                // Push neighbors in reverse order to simulate recursive DFS
                List<Integer> neighbors = adjList.get(node);
                Collections.reverse(neighbors);
                for (int neighbor : neighbors) {
                    if (!visited[neighbor]) {
                        st.push(neighbor);
                    }
                }
                Collections.reverse(neighbors); // Restore original list (optional)
            }
        }
    }

    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> adjList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        // Undirected graph edges
        adjList.get(0).add(1);
        adjList.get(0).add(2);
        adjList.get(1).add(0);
        adjList.get(1).add(3);
        adjList.get(2).add(0);
        adjList.get(2).add(4);
        adjList.get(3).add(1);
        adjList.get(4).add(2);

        System.out.println("DFS (iterative) starting from node 0:");
        dfs(adjList, n, 0);
    }
}
