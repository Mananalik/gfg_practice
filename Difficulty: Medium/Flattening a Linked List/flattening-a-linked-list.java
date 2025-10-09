/*
class Node {
    int data;
    Node next;
    Node bottom;

    Node(int x) {
        data = x;
        next = null;
        bottom = null;
    }
}
*/
class Solution {
    public Node flatten(Node root) {
        // code here
        // Brute force
        ArrayList<Integer> arr = new ArrayList<>();
        while(root!=null){
            Node temp = root;
            while(temp!=null){
                arr.add(temp.data);
                temp = temp.bottom;
            }
           root = root.next;
        }
        Collections.sort(arr);
        return convertToLinkedlist(arr);
    }
    public Node convertToLinkedlist(ArrayList<Integer> arr){
        Node dummy = new Node(-1);
        Node temp = dummy;
        for(int i=0;i<arr.size();i++){
            temp.bottom = new Node(arr.get(i));
            temp = temp.bottom;
        }
        return dummy.bottom;
    }
}