class Solution {
    public static ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        int indegree[] = new int[V];
        for(int x[]:edges){
            int u = x[0];
            int v = x[1];
            adj.get(u).add(v);
            indegree[v]++;
        }
        ArrayList<Integer> ans = new ArrayList<>();

        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<V;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int node = q.poll();
            ans.add(node);
            for(int i:adj.get(node)){
                indegree[i]=indegree[i]-1;
                if(indegree[i]==0){
                    q.add(i);
                }
            }
        }
        return ans;
    }
}