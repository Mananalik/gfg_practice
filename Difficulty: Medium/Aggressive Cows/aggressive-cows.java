// User function Template for Java
class Solution {
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        int s = 1;
        Arrays.sort(stalls);
        int n = stalls.length;
        int e = stalls[n-1]-stalls[0];
        while(s<=e){
            int mid = s+(e-s)/2;
            if(func(stalls,mid,k)){
                s = mid+1;
            }else{
                e = mid-1;
            }
        
        }
        return e;
    }
    static boolean func(int [] arr, int dist , int cows){
        int cnt = 1;
        int last = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-last>=dist){
                cnt++;
                last = arr[i];
            }
        }
        if(cnt>=cows) return true;
        return false;
    }
}