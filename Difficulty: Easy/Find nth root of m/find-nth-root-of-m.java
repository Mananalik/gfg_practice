// User function Template for Java

class Solution {
    public int nthRoot(int n, int m) {
        // code here
       int s = 0;
       int e = m;
       while(s<=e){
           int mid = s+(e-s)/2;
           long mult = 1;
           for(int i=0;i<n;i++){
               mult = mult*mid;
           }
           if(mult==m){
               return mid;
           }
           else if(mult<m){
               s=mid+1;
           }
           else if(mult>m){
               e=mid-1;
           }
       }
       return -1;
    }
}