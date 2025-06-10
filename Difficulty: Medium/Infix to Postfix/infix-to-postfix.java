//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            System.out.println(new Solution().infixToPostfix(br.readLine().trim()));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public static String infixToPostfix(String s) {
        // code here
        StringBuilder sb = new StringBuilder("");
        HashMap<Character,Integer> mp = new HashMap<>();
        Stack<Character> st = new Stack<>();
        mp.put('^',3);
        mp.put('*',2);
        mp.put('/',2);
        mp.put('+',1);
        mp.put('-',1);
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                sb.append(s.charAt(i));
            }
            else if(s.charAt(i)=='('){
                st.push(s.charAt(i));
            }
            else if (s.charAt(i)==')'){
                while(!st.isEmpty() && st.peek()!='('){
                    sb.append(st.pop());
                }
                while(!st.isEmpty() && st.peek()=='('){
                    st.pop();
                }
            }
            else{
                while(!st.isEmpty() && st.peek()!='(' && mp.get(s.charAt(i))<=mp.get(st.peek())){
                    sb.append(st.pop());
                }
                st.push(s.charAt(i));
            }
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.toString();
    }
}