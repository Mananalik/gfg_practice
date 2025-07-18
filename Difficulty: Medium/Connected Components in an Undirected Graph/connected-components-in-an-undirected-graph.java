
class Solution {
    public ArrayList<ArrayList<Integer>> getComponents(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int x[]: edges){
            int u = x[0];
            int v = x[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean vis[] = new boolean[V];
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for(int i=0;i<V;i++){
            
            if(vis[i]!=true){
                ArrayList<Integer> ans = new ArrayList<>();
                dfs(i,vis,ans,adj);
                arr.add(ans);
            }
        }
        return arr;
    }
    static void dfs(int node , boolean vis[],  ArrayList<Integer> ans,
                ArrayList<ArrayList<Integer>> adj)
                {
                    vis[node] = true;
                    ans.add(node);
                    for(int i: adj.get(node)){
                        if(vis[i]!=true){
                            dfs(i,vis,ans,adj);
                        }
                    }
                }
}