class Solution {
    public String minWindow(String s1, String s2) {
        // code here
        if(s2.length()>s1.length() || s1.equals("") ||s2.equals("")) return "";
        int p1 = 0;
        int p2 = 0;
        int end = 0;
        int start = 0;
        int minLen = Integer.MAX_VALUE;
        while(p1<s1.length()){
            if(s1.charAt(p1)==s2.charAt(p2)){
                p2++;
                if(p2==s2.length()) {
                    end = p1;
                    p2--;
                    while(p2>=0){
                        if(s1.charAt(p1)==s2.charAt(p2)){
                            p2--;
                            if(p2<0 && minLen>end-p1+1){
                                start = p1;
                                minLen = end-start+1;
                            }
                            
                        }
                        p1--;
                    }
                    p2 = 0;
                    p1 = p1+1;
                }
            }
            p1++;
        }
        return minLen==Integer.MAX_VALUE?"":s1.substring(start,start+minLen);
    }
}
