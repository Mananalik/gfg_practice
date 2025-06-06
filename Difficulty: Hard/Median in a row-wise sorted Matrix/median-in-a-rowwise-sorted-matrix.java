// User function Template for Java

class Solution {
    int median(int mat[][]) {
        // code here
        int m = mat.length;
        int n = mat[0].length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<m;i++){
            min = Math.min(mat[i][0],min);
            max = Math.max(mat[i][n-1],max);
        }
        int s = min;
        int e = max;
        int req = (m*n)/2;
        while(s<=e){
            int mid = s+(e-s)/2;
            int cntsmall = func(mat,m,n,mid);
            if(cntsmall<=req) s = mid+1;
            else e = mid-1;
        }
        return s;
    }
    static int func(int[][] mat, int m , int n , int x){
        int cnt = 0;
        for(int i=0;i<m;i++){
            cnt+=upper(mat[i],n,x);
        }
        return cnt;
    }
    static int upper(int[] mat , int n , int x){
        int s = 0;
        int e = n-1;
        int ans = n;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(mat[mid]>x){
                ans = mid;
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return ans;
    }
}