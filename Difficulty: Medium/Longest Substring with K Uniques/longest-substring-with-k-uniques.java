class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        int l = 0;
        int r = 0;
        int maxLen = -1;
        int n = s.length();
        HashMap<Character,Integer> mp = new HashMap<>();
        while(r<n){
            mp.put(s.charAt(r),mp.getOrDefault(s.charAt(r),0)+1);
            while(mp.size()>k){
                mp.put(s.charAt(l),mp.get(s.charAt(l))-1);
                if(mp.get(s.charAt(l))==0) mp.remove(s.charAt(l));
                l++;
            }
            if (mp.size()==k){
                maxLen = Math.max(maxLen,r-l+1);
            }
            
            r++;
        }
        return maxLen;
    }
}