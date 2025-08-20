
class Solution {
    int countPartitions(int[] arr, int d) {
        // code here
        int totalSum = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            totalSum+=arr[i];
        }
        if(totalSum-d<0) return 0;
        int sum2 = (totalSum-d)/2;
        if((totalSum-d)%2==1) return 0;
        int dp[][] = new int[n][sum2+1];
        for(int x[]:dp){
            Arrays.fill(x,-1);
        }
        return func(n-1,sum2,arr,dp);
    }
    static int func(int index, int target,int [] arr,int[][] dp){
        if(index==0){
            if(target==0 && arr[0]==0){
                return 2;
            }
            if(target==0 || target==arr[0]){
                return 1;
            }
            return 0;
        }
        if(dp[index][target]!=-1) return dp[index][target];
        int notPick = func(index-1,target,arr,dp);
        int pick =0;
        if(arr[index]<=target){
            pick = func(index-1,target-arr[index],arr,dp);
        }
        return dp[index][target]=pick+notPick;
    }
}