// User function Template for Java

class Solution {
    static String postToPre(String post_exp) {
        // code here
        Stack<String> st = new Stack<>();
        for(int i=0;i<post_exp.length();i++){
            char ch = post_exp.charAt(i);
            if(!isOperator(ch)){
                st.push(Character.toString(ch));
            }else{
                 String t1 = st.pop();
                 String t2 = st.pop();
                 String ans= ch+t2+t1;
                 st.push(ans);
            }
        }
        return st.pop();
    }
    static boolean isOperator(char ch){
        return ch=='^' || ch=='*' || ch=='+' || ch=='-' || ch=='/';
    }
}
