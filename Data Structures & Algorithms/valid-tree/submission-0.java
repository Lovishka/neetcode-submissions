class Solution {
     int[]  parent;
     int[]  rank;
    public boolean validTree(int n, int[][] edges) {
      parent=new int[n];
      rank=new int[n];
    for(int i=0;i<n;i++){
        parent[i]=i;
        rank[i]=0;
    }
    if(edges.length!=n-1)return false;  //no cycle will be formed 
   for(int[] e:edges){
            if(union(e[0],e[1])==false)return false;
        
    }
    return true;

    }
    public  int find(int x){
        if(x==parent[x]){
            return x;
        }
        return parent[x]=find(parent[x]);
    }
    public  boolean union(int x,int y){
        int p_x=find(x);
        int p_y=find(y);

        if(p_x==p_y)return false;

        if(rank[p_x]>rank[p_y]){
            parent[p_y]=p_x;
        }
        else if(rank[p_x]<rank[p_y]){
            parent[p_x]=p_y;
        }
        else if(rank[p_x]==rank[p_y]){
            parent[p_y]=parent[p_x];
            rank[p_x]++;
        }
        return true;
    }
}
