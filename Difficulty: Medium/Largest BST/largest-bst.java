// class Node
// {
//     int data;
//     Node left, right;

//     public Node(int d)
//     {
//         data = d;
//         left = right = null;
//     }
// }
class NodeValue{
    public int maxNode,minNode,maxSize;
    NodeValue(int maxNode,int minNode, int maxSize){
        this.maxNode = maxNode;
        this.minNode = minNode;
        this.maxSize = maxSize;
    }
}
class Solution {
    static NodeValue func(Node root){
        if(root==null) return new NodeValue(Integer.MIN_VALUE,Integer.MAX_VALUE,0);
        NodeValue left = func(root.left);
        NodeValue right = func(root.right);
        if(root.data>left.maxNode && root.data<right.minNode){
            return new NodeValue(Math.max(root.data,right.maxNode),Math.min(root.data,left.minNode),
                        left.maxSize+right.maxSize+1);
        }
        return new NodeValue(Integer.MAX_VALUE,Integer.MIN_VALUE,Math.max(left.maxSize,right.maxSize));
    }
    // Return the size of the largest sub-tree which is also a BST
    static int largestBst(Node root) {
        // Write your code here
        return func(root).maxSize;
    }
}