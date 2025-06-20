// User function Template for Java

class Solution {
    public static int[] count_NGEs(int N, int arr[], int queries, int indices[]) {
        // code here
     int nge[] =new int[queries];
     for(int i=0;i<queries;i++){
         int index = indices[i];
         int cnt = 0;
         for(int j=index+1;j<N;j++){
             if(arr[index]<arr[j]){
                 cnt++;
             }
         }
         nge[i] = cnt;
     }
     return nge;
    }
}
