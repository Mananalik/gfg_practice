// User function Template for Java

class Solution {
    static int knapSack(int val[], int wt[], int capacity) {
        // code here
        int n = val.length;
        int dp[][] = new int[n][capacity+1];
        for(int x[]:dp){
            Arrays.fill(x,-1);
        }
        return func(n-1,capacity,val,wt,dp);
    }
    static int func(int index , int W ,int val[] , int wt[],int[][] dp){
        if(index==0){
            return ((int) (W/wt[0])*val[0]);
        }
        if(dp[index][W]!=-1) return dp[index][W];
        int notPick = 0+func(index-1,W,val,wt,dp);
        int pick = Integer.MIN_VALUE;
        if(wt[index]<=W){
            pick = val[index]+func(index,W-wt[index],val,wt,dp);
        }
        return dp[index][W]=Math.max(pick,notPick);
    }
}