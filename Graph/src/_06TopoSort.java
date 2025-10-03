import java.util.*;
/** The main purpose of topological sort is:
 To find a linear ordering of tasks (vertices) in a Directed Acyclic Graph (DAG)
 such that every task is done after all its dependencies are completed.**/
public class _06TopoSort {
    private  static void topologicalSort(List<List<Integer>> list, ArrayList<Integer> topo){
        int[] inDegree = new int[list.size()];
        for(int i =0;i<inDegree.length;i++){
            for(int neigh : list.get(i)){
                inDegree[neigh]++;
            }
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i =0;i<inDegree.length;i++){
            if(inDegree[i] == 0){
                queue.offer(i);
            };
        }
        while(!queue.isEmpty()) {
            int curr = queue.poll();
            topo.add(curr);
            for (int neighbor : list.get(curr)) {
                inDegree[neighbor]--;
                if (inDegree[neighbor] == 0) {
                    queue.offer(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        int V = 6;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

        // Add edges
        adj.get(5).add(0);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(2).add(3);
        adj.get(3).add(1);

        ArrayList<Integer> topo = new ArrayList<>();
        topologicalSort(adj, topo);

        // Print topological order
        System.out.println("Topological Order: " + topo);
    }
}
