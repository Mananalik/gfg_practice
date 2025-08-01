class Pair{
    int node;
    int dist;
    Pair(int node , int dist){
        this.node = node;
        this.dist = dist;
    }
}
class Solution {
    public int[] dijkstra(int V, int[][] edges, int src) {
        // code here
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        Queue<Pair> q = new LinkedList<>();
        int dist[] = new int[V];
        for(int i=0;i<V;i++){
            dist[i]= (int) 1e9;
        }
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int x[]: edges){
            int u = x[0];
            int v = x[1];
            int d = x[2];
            adj.get(u).add(new Pair(v,d));
        }
        dist[src] = 0;
        q.add(new Pair(src,0));
        while(!q.isEmpty()){
            Pair p = q.poll();
            int node =p.node;
            int d = p.dist;
            for(Pair i : adj.get(node)){
                int n = i.node;
                int d1 = i.dist;
                if(dist[node]+d1<dist[n]){
                    dist[n] = dist[node]+d1;
                    q.add(new Pair(n,d1));
                }
            }
        }
        for(int i=0;i<V;i++){
            if(dist[i]==1e9){
                dist[i] = -1;
            }
        }
        return dist;
    }
}