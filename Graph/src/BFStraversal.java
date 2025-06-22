import java.lang.reflect.Array;
import java.util.*;

public class BFStraversal {

    public static void bfs(List<List<Integer>> adjList , int v, int src){
        boolean []visited = new boolean[v];
        Queue<Integer> q = new LinkedList<>();

        q.offer(src);
        visited[src] = true;
        while(!q.isEmpty()){

            int curr = q.poll();
            System.out.print(curr +" ");

            for(int neighbour : adjList.get(curr)){
                if(!visited[neighbour]){
                    visited[neighbour] = true;
                    q.offer(neighbour);
                }
            }
        }

    }

    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        // Add edges
        adjList.get(0).add(1);
        adjList.get(0).add(2);
        adjList.get(1).add(0);
        adjList.get(1).add(3);
        adjList.get(2).add(0);
        adjList.get(2).add(4);
        adjList.get(3).add(1);
        adjList.get(4).add(2);

        System.out.println("BFS traversal from node 0:");
        bfs(adjList, 5, 0);
    }

}
