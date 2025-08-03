// User function Template for Java
class Pair{
    int node;
    int steps;
    Pair(int node, int steps){
        this.node = node;
        this.steps = steps;
    }
}
class Solution {
    int minimumMultiplications(int[] arr, int start, int end) {

        // Your code here
        if(start==end) return 0;
        int mod = 100000;
        Queue<Pair> q = new LinkedList<>();
        int dist[] = new int[100000];
        for(int i=0;i<dist.length;i++){
            dist[i]=(int) 1e9;
        }
        q.add(new Pair(start,0));
        dist[start]=0;
        while(!q.isEmpty()){
            Pair p = q.poll();
            int node = p.node;
            int step = p.steps;
            for(int i=0;i<arr.length;i++){
                int num = (arr[i]*node)%mod;
                if(step+1<dist[num]){
                    dist[num] = step+1;
                     if(num==end) return step+1;
                    q.add(new Pair(num,dist[num]));
                }
               
            }
        }
        return -1;
    }
}
