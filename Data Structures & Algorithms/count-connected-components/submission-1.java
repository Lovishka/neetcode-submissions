class Solution {
    public int countComponents(int n, int[][] edges) {  
    ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
    for(int i=0;i<n;i++){
        adj.add(new ArrayList<>());
    }
    for(int[] e:edges){
        int u=e[0];
        int v=e[1];
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    int count=0;
    int[] visited=new int[n];
    for(int i=0;i<n;i++){
        if(visited[i]==0){
            dfs(i,adj,visited);
            count++;
        }
    }
    return count;

    }
    void dfs(int node,ArrayList<ArrayList<Integer>> adj,int[] visited){
        visited[node]=1;
        for(int adjnode:adj.get(node)){
            if(visited[adjnode]==0){
                dfs(adjnode,adj,visited);
            }
        }
    }
}
