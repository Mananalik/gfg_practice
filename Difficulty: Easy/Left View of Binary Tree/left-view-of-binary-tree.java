/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class Solution {
    ArrayList<Integer> leftView(Node root) {
        // code here
        ArrayList<Integer> ans  = new ArrayList<>();
        func(root,0,ans);
        return ans;
    }
    public void func(Node node, int level, ArrayList<Integer>list){
        if(node==null){
            return;
        }
        if(list.size()==level){
            list.add(node.data);
        }
        func(node.left,level+1,list);
        func(node.right,level+1,list);
    }
}