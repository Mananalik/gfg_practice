// User function Template for Java

class Solution {
    static int solve(int bt[]) {
        // code here
        Arrays.sort(bt);
        int n = bt.length;
        int wtTime = 0;
        int t = 0;
        for(int i=0;i<n;i++){
            wtTime+=t;
            t+=bt[i];
        }
        return wtTime/n;
    }
}
