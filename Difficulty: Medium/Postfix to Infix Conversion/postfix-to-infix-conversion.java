

class Solution {
    static String postToInfix(String exp) {
        Stack<String> st = new Stack<>();

      for(int i=0;i<exp.length();i++){
          char ch = exp.charAt(i);
          if(!isOperator(ch)){
              st.push(Character.toString(ch));
          }else{
              String t2 = st.pop();
              String t1 = st.pop();
              String ans = "("+t1+ch+t2+")";
              st.push(ans);
          }
      }

        return st.pop(); // or st.peek()
    }

    static boolean isOperator(char ch) {
        return ch=='^' || ch=='*' || ch=='+' || ch=='-' ||
                ch=='/' || ch=='%';
    }
}
