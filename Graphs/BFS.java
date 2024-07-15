package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        // Start BFS from the first node (assuming node 0 exists and is the start)
        q.add(0);
        visited[0] = true;

        while (!q.isEmpty()) {
            int curr = q.poll();
            ans.add(curr);

            for (int i = 0; i < adj.get(curr).size(); i++) {
                int negh = adj.get(curr).get(i);
                if (!visited[negh]) {
                    visited[negh] = true;
                    q.add(negh);
                }
            }
        }
        return ans;
    }
}
