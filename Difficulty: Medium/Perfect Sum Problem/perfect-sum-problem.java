class Solution {
    // Function to calculate the number of subsets with a given sum
    public int perfectSum(int[] nums, int target) {
        // code here
        int n = nums.length;
        int dp[][] = new int[n][target+1];
        for(int x[]:dp){
            Arrays.fill(x,-1);
        }
        return func(n-1,target,nums,dp);
    }
    static int func(int index, int target,int [] arr,int [][] dp){
        if(index==-1){
            return target==0?1:0;
        }
        if(dp[index][target]!=-1) return dp[index][target];
        int notPick = func(index-1,target,arr,dp);
        int pick = 0;
        if(arr[index]<=target){
            pick = func(index-1,target-arr[index],arr,dp);
        }
        return dp[index][target]=pick+notPick;
    }
}