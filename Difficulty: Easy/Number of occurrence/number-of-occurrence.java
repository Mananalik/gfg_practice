class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int s = func(arr,target,true);
        int e= func(arr,target,false);
        if(s==-1){
            return 0;
        }else{
            return e-s+1;
        }
    }
    static int func(int arr[], int target, Boolean first){
        int s=0;
        int e=arr.length-1;
        int ans=-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(target>arr[mid]){
                s=mid+1;
            }
            else if(target<arr[mid]){
                e=mid-1;
            }else{
                if(first){
                    ans=mid;
                    e=mid-1;
                }else{
                    ans=mid;
                    s=mid+1;
                }
            }
        }
        return ans;
    }
}
