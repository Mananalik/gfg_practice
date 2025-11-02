class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int n = arr.length;
        if(n<2){
            return -1;
        }
        int maxi1 = Integer.MIN_VALUE;
        int maxi2 = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>maxi1){
                maxi2 = maxi1;
                maxi1 = arr[i];
                
            }
            if(arr[i]>maxi2 && arr[i]!=maxi1){
                    maxi2 = arr[i];
                }
        }
        if (maxi2 == Integer.MIN_VALUE) {
            return -1;
        }
        return maxi2;
    }
}