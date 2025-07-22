// User function Template for Java

class Solution {
    static List<Integer> minPartition(int N) {
        // code here
        int arr[] = {1,2,5,10,20,50,100,200,500,2000};
        List<Integer> list  = new ArrayList<>();
        int i = arr.length-1;
        while(N!=0){
            if(arr[i]>N){
                i--;
            }else{
                N = N-arr[i];
                list.add(arr[i]);
            }
        }
        return list;
    }
}