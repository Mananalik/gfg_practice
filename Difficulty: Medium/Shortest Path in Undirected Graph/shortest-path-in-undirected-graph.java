
class Solution {
    // Function to find the shortest path from a source node to all other nodes
    public int[] shortestPath(ArrayList<ArrayList<Integer>> adj, int src) {
        // code here
        int v = adj.size();
        int dist[] = new int [v];
        for(int i=0;i<v;i++){
            dist[i] = (int) 1e9;
        }
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        dist[src] = 0;
        while(!q.isEmpty()){
            int node = q.poll();
            for(int i : adj.get(node)){
                if(dist[node]+1<dist[i]){
                    dist[i] = 1+dist[node];
                    q.add(i);
                }
                
            }
        }
        for(int i=0;i<v;i++){
            if(dist[i]==1e9){
               dist[i] = -1;
            }
        }
        return dist;
    }
}
