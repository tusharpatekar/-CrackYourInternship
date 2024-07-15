package Graphs;

import java.util.ArrayList;

public class DFS {
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        ArrayList<Integer> ans = new ArrayList<>();

        dfsUtil(adj, ans, 0, visited);
        return ans;
    }
    private void dfsUtil(ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ans, int curr, boolean[] visited){
        ans.add(curr);
        visited[curr] = true;
        for(int i=0; i<adj.get(curr).size(); i++){
            int negh = adj.get(curr).get(i);
            if(!visited[negh]){
                dfsUtil(adj, ans, negh, visited);
            }
        }
    }
}
