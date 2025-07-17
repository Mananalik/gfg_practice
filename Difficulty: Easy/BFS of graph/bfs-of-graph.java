class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> bfs1 = new ArrayList<>();
        int v = adj.size();
        int vis[] =new int[v];
        Queue<Integer> q = new LinkedList<>();
        vis[0]=1;
        q.add(0);
        while(!q.isEmpty()){
            int node=q.poll();
            bfs1.add(node);
            for(int i: adj.get(node)){
                if(vis[i]!=1){
                    vis[i]=1;
                    q.add(i);
                }
            }
        }
        return bfs1;
    }
}