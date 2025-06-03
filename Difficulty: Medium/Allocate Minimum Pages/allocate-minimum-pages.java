
//Back-end complete function Template for Java

class Solution {
    public static int findPages(int[] arr, int k) {
        // code here
        if(arr.length<k){
            return -1;
        }
     int max = Integer.MIN_VALUE;
     int sum =0;
     for(int i=0;i<arr.length;i++){
         max = Math.max(arr[i],max);
         sum+=arr[i];
     }
     int s = max;
     int e = sum;
     while(s<=e){
         int mid = s+(e-s)/2;
         int stdcnt = func(arr,mid);
         if(stdcnt>k){
             s = mid+1;
         }else{
             e = mid-1;
         }
     }
     return s;
    }
    static int func(int[] arr , int len){
        int n = arr.length;
        int stdcnt = 1;
        int allocation=0;
        for(int i=0;i<n;i++){
            if(allocation+arr[i]<=len){
                allocation+=arr[i];
            }else{
                stdcnt++;
                allocation=arr[i];
            }
        }
        return stdcnt;
    }
}