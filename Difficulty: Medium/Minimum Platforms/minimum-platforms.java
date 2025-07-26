// User function Template for Java

class Solution {
    // Function to find the minimum number of platforms required at the
    // railway station such that no train waits.
    static int findPlatform(int arr[], int dep[]) {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        int n = arr.length;
        int i =0;
        int j = 0;
        int maxCount=0;
                    int cnt =0;
        while(i<n){

            if(arr[i]<=dep[j]){
                cnt++;
                i=i+1;
                
            }else{
                cnt=cnt-1;
                j=j+1;
            }
            maxCount = Math.max(cnt,maxCount);
        }
        return maxCount;
    }
}
