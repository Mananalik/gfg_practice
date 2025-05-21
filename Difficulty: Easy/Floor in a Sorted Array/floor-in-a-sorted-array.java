class Solution {

    static int findFloor(int[] arr, int x) {
        // write code here
        int s=0;
        int e=arr.length-1;
        int ans=-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(x>=arr[mid]){
                ans=mid;
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return ans;
        
    }
}
