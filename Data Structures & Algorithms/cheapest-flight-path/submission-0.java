class Solution {
    class Pair{
        int to,cost;
        Pair(int to,int cost){
            this.to=to;
            this.cost=cost;
        }
    }
    class Tuple{
        int node,dist,steps;
        Tuple(int node,int dist,int steps){
            this.node=node;
            this.dist=dist;
            this.steps=steps;
        }
    }
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
            ArrayList<ArrayList<Pair>> adj=new ArrayList<>();
            for(int i=0;i<n;i++){
                adj.add(new ArrayList<>());
            }
            for(int[] f:flights){
                int from=f[0],to=f[1],cost=f[2];
                adj.get(from).add(new Pair(to,cost));
            }

            Queue<Tuple> q=new LinkedList<>();
            q.offer(new Tuple(src,0,0));

            int[] distance=new int[n];
            Arrays.fill(distance,Integer.MAX_VALUE);
            distance[src]=0;

            while(!q.isEmpty()){
                Tuple curr=q.poll();
                int node=curr.node;
                int dist=curr.dist;
                int steps=curr.steps;

                for(Pair adjnode:adj.get(node)){
                    int to=adjnode.to;
                    int cost=adjnode.cost;
                    if(dist + cost < distance[to] && steps<=k ){
                        distance[to]=dist+cost;
                        q.offer(new Tuple(to,distance[to],steps+1));
                    }
                }
            }
            return distance[dst]==Integer.MAX_VALUE?-1:distance[dst];
    }
}
