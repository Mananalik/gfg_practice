// User function Template for Java

class Solution {
    public int minTime(int[] arr, int k) {
        // code here
        // if(arr.length<k){
        //     return -1;
        // }
        int max = Integer.MIN_VALUE;
        int sum =  0;
        for(int i=0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
            sum+=arr[i];
        }
        int s = max;
        int e = sum;
        while(s<=e){
            int mid = s+(e-s)/2;
            int cnt = func(arr,mid);
            if(cnt>k){
                s=mid+1;
            }else{
                e = mid-1;
            }
        }
        return s;
    }
    static int func(int [] arr , int len){
    int n = arr.length;
    int cnt = 1;
    int sum = 0;
    for(int i=0;i<n;i++){
        if(sum+arr[i]<=len){
            sum+=arr[i];
        }else{
            cnt++;
            sum = arr[i];
        }
    }
    return cnt;
    }
}
