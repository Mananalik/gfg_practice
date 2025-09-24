/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Pair{
    Node node;
    int dist;
    Pair(Node node, int dist){
        this.node = node;
        this.dist = dist;
    }
}

class Solution {
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }
        Map<Integer,Integer> mp = new TreeMap<>();
        Queue<Pair> q =  new LinkedList<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair p = q.poll();
            Node node = p.node;
            int line = p.dist;
            if(!mp.containsKey(line)){
                mp.put(line,node.data);
            }
            if(node.left!=null){
                q.add(new Pair(node.left,line-1));
            }
            if(node.right!=null){
                q.add(new Pair(node.right,line+1));
            }
        }
        for(Map.Entry<Integer,Integer> entry: mp.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
}