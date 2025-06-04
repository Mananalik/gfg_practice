// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int m = arr.length;
        int n = arr[0].length;
        int max = 0;
        int cntmax = 0;
        for(int i = 0;i<m;i++){
            int cnt = n-func(arr,i,n);
            if(cnt>cntmax){
                cntmax = cnt;
                max = i;
            }
        }
        return max;
    }
    static int func(int arr[][],int r, int c){
        int s = 0;
        int e = c-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[r][mid]==0){
                s = mid+1;
            }else{
                e = mid-1;
            }
        }
        return s;
    }
}