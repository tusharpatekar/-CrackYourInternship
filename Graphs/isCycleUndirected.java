package Graphs;
import java.util.ArrayList;
public class isCycleUndirected {

        // Function to detect cycle in an undirected graph.
        public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
            boolean[] visited = new boolean[V];
            for (int i = 0; i < V; i++) {
                if (!visited[i]) {
                    if (isCycleUtil(adj, visited, i, -1)) {
                        return true;
                    }
                }
            }
            return false;
        }

        private boolean isCycleUtil(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int curr, int parent) {
            visited[curr] = true;
            for (int neighbor : adj.get(curr)) {
                if (!visited[neighbor]) {
                    if (isCycleUtil(adj, visited, neighbor, curr)) {
                        return true;
                    }
                } else if (neighbor != parent) {
                    return true;
                }
            }
            return false;
        }
}


