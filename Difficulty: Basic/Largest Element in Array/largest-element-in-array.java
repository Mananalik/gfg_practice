class Solution {
    public static int largest(int[] arr) {
        // code here
        int n = arr.length;
        int maxi = 0;
        for(int i=0;i<n;i++){
            if(arr[i]>maxi){
                maxi = arr[i];
            }
        }
        return maxi;
    }
}
