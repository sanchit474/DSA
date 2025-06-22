import java.util.ArrayList;
import java.util.List;

class _03GraphWL{
    class Pair{
        int node;
        int wt;
        public Pair(int node, int wt) {
            this.node = node;
            this.wt = wt;
        }
    }
    private int vertices;
    List<List<Pair>> adjList;
// make the constructor and initialize the list to null arraylist
    public  _03GraphWL(int vertices){
        this.vertices = vertices;
        adjList= new ArrayList<>();
        for(int i=0;i<vertices;i++){
            adjList.add(new ArrayList<>());

        }
    }

    public void addWeightedEdgeToList(int[][] edges,boolean isDirected){
        for(int[] edge : edges){
            int s = edge[0];
            int d = edge[1];
            int wt = edge[2];

            adjList.get(s).add(new Pair(d,wt));
            if(!isDirected){
                adjList.get(d).add(new Pair(s,wt));
            }
        }
    }
    public void printWeightedList() {
        for (int i = 0; i < adjList.size(); i++) {
            System.out.print(i + " -> ");
            for (Pair p : adjList.get(i)) {
                System.out.print("(" + p.node + ", w=" + p.wt + ") ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int vertices = 4;

        System.out.println("\nUndirected Graph (Weighted):");
        int[][] edgesW = { {0, 2, 20}, {0, 1, 10}, {1, 3, 30} };
        _03GraphWL graphW = new _03GraphWL(vertices);
        graphW.addWeightedEdgeToList(edgesW, false);
        graphW.printWeightedList();

    }
}
