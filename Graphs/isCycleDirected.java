package Graphs;

import java.util.ArrayList;

public class isCycleDirected {
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        boolean[] stack = new boolean[V];
        for(int i=0; i<V; i++){
            if(!visited[i]){
                if(isCycleUtil(adj, i, visited, stack)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isCycleUtil(ArrayList<ArrayList<Integer>> adj, int curr, boolean[] visited, boolean[] stack){

        visited[curr] = true;
        stack[curr] = true;

        for(int i=0; i<adj.get(curr).size(); i++){
            int negh = adj.get(curr).get(i);

            if(stack[negh]){
                return true;
            }

            if(!visited[negh] && isCycleUtil(adj, negh, visited, stack)){
                return true;
            }


        }
        stack[curr] = false;
        return false;
    }
}
