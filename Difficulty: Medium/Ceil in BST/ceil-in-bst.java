/* class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
} */

class Tree {
    int findCeil(Node root, int key) {
        // code here
        int ceil = -1;
        while(root!=null){
            if(key==root.data){
                ceil = root.data;
                return root.data;
            }
            if(key>root.data){
                root = root.right;
            }else{
                ceil = root.data;
                root = root.left;
            }
        }
        return ceil;
        
    }
}