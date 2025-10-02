/*
class Node{
    int data;
    Node left,right;

    Node(int key)
    {
        data = key;
        left = right = null;
    }
}
*/
class Solution {
    public boolean isSumProperty(Node root) {
        //  code here
      return func(root)==1? true:false;  
    }
    public int func(Node root){
        int sum = 0;
        if(root==null || (root.left==null && root.right==null)){
            return 1;
        }else{
            if(root.left!=null){
                sum+=root.left.data;
            }
            if(root.right!=null){
                sum+=root.right.data;
            }
            if(sum==root.data && func(root.left)==1 && func(root.right)==1){
                return 1;
            }else{
                return 0;
            }
        }
        
    }
}