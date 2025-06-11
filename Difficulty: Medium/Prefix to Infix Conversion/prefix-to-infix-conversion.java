// User function Template for Java

class Solution {
    static String preToInfix(String pre_exp) {
        // code here
        Stack<String> st = new Stack<>();
        for(int i=pre_exp.length()-1;i>=0;i--){
            char ch = pre_exp.charAt(i);
            if(!isOperator(ch)){
                st.push(Character.toString(ch));
            }else{
                String ans="";
                if(!st.isEmpty()){
                   String t1 = st.pop(); 
                  String t2= st.pop();
                   ans = "("+t1+ch+t2+")";
                }
                
                st.push(ans);
            }
        }
        return st.pop();
    }
    static boolean isOperator(char ch){
        return ch=='^' || ch=='*' || ch=='/' || ch=='%' || ch=='+' || ch=='-';
    }
}
