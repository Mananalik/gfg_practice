// User function Template for Java

class Solution {
    static int countMin(String str) {
        // code here
        StringBuilder sb = new StringBuilder(str);
        String str2 = sb.reverse().toString();
        int n = str.length();
        int dp[][]= new int[n][n];
        for(int x[]:dp){
            Arrays.fill(x,-1);
        }
        int i = n-1;
        int j = n-1;
        int len = func(i,j,str,str2,dp);
        return n-len;
    }
    static int func(int index1 , int index2, String str, String str2 , int [][] dp){
        if(index1<0 || index2<0){
            return 0;
        }
        if(dp[index1][index2]!=-1) return dp[index1][index2];
        if(str.charAt(index1)==str2.charAt(index2)){
            return dp[index1][index2] = 1+func(index1-1,index2-1,str,str2,dp);
        }else{
            return dp[index1][index2] = 0+Math.max(func(index1-1,index2,str,str2,dp),func(index1,index2-1,str,str2,dp));
        }
    }
    
}