// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int n = arr.length;
        int sum = 0;
        int maxLen = 0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==k){
                maxLen = Math.max(maxLen,i+1);
            }
            int rem = sum-k;
            if(mp.containsKey(rem)){
                int len = i-mp.get(rem);
                maxLen = Math.max(maxLen,len);
            }
            if(!mp.containsKey(sum)){
                mp.put(sum,i);
            }
        }
        return maxLen;
    }
}
