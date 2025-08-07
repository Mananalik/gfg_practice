// User function Template for Java

class Solution {
    public int maximumPoints(int arr[][]) {
        // code here
        int m = arr.length;
        int n = arr[0].length;
        int dp[][] = new int[m][4];
        for(int i=0;i<m;i++){
            for(int j=0;j<4;j++){
                dp[i][j]=-1;
            }
        }
        return func(arr,arr.length-1,3,dp);
    }
    static int func(int arr[][], int row , int col, int[][] dp){
        if(row==0){
            int maxi = 0;
            for(int i=0;i<=2;i++){
                if(i!=col){
                    maxi = Math.max(maxi,arr[row][i]);
                }
            }
            return dp[row][col]=maxi;
            
        }
        if(dp[row][col]!=-1) return dp[row][col];
        int max = 0;
        for(int i=0;i<=2;i++){
            if(i!=col){
                int activity = arr[row][i]+func(arr,row-1,i,dp);
                max = Math.max(max,activity);
            }
        }
        return dp[row][col]=max;
    }
}