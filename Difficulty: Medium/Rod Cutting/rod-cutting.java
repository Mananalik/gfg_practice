class Solution {
    public int cutRod(int[] price) {
        // code here
        int n = price.length;
        int dp[][] = new int[n+1][n+1];
        for(int x[]:dp){
            Arrays.fill(x,-1);
        }
        return func(n-1,n,price,dp);
    }
    static int func(int index, int target , int arr[] , int dp[][]){
        if(index==0){
            return target*arr[0];
        }
        if(dp[index][target]!=-1) return dp[index][target];
        int notPick = 0+func(index-1 , target,arr,dp);
        int pick = Integer.MIN_VALUE;
        int roadLength = index+1;
        if(roadLength<=target){
            pick = arr[index] + func(index,target-roadLength,arr,dp);
        }
        return dp[index][target]=Math.max(pick,notPick);
    }
}