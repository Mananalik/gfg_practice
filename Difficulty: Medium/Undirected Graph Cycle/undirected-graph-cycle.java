class Pair{
    int first;
    int second;
    Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}
class Solution {
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int x[]:edges){
            int u = x[0];
            int v = x[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int vis[] = new int[V];
        for(int i=0;i<V;i++){
            if(vis[i]==0){
                if(func(i,adj,vis)) return true;
            }
        }
       return false;
    }
    static boolean func(int src,ArrayList<ArrayList<Integer>> adj,int vis[]){
         Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(-1,src));
        while(!q.isEmpty()){
            int parent = q.peek().first;
            int child = q.peek().second;
            q.remove();
            vis[child] = 1;
            for(int i: adj.get(child)){
                if(vis[i]==0){
                    q.add(new Pair(child,i));
                }
                else if(parent!=i){
                    return true;
                }
            }
        }
        return false;
    }
}