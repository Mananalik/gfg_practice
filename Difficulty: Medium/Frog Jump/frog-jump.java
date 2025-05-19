//{ Driver Code Starts
// Initial Template for Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        // Initialize BufferedReader for efficient input reading
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read the number of test cases
        String str = br.readLine();
        int t = Integer.parseInt(str.trim());

        // Process each test case
        while (t-- > 0) {
            // Read the next line containing the array elements
            str = br.readLine();
            String[] tokens = str.trim().split("\\s+");

            // Convert the input strings to integers and store in an array
            ArrayList<Integer> list = new ArrayList<>();
            for (String token : tokens) {
                if (!token.isEmpty()) { // Ensure that the token is not empty
                    list.add(Integer.parseInt(token));
                }
            }

            // Convert ArrayList to int[] for processing
            int[] arr = list.stream().mapToInt(Integer::intValue).toArray();

            // Create an instance of Solution and compute the minimum energy
            Solution ob = new Solution();
            int result = ob.minCost(arr);

            // Output the result followed by a tilde as per the original C++ code
            System.out.println(result);
            System.out.println("~");
        }
    }
}


// } Driver Code Ends

// User function Template for Java
class Solution {
    int minCost(int[] height) {
        // code here
        int n = height.length-1;
        int dp[] = new int[height.length];
        for(int i=0;i<height.length;i++){
            dp[i]=-1;
        }
        return func(n,height,dp);
    }
    static int func(int index ,int arr[], int dp[]){
        if(index==0){
            return 0;
        }
        if(dp[index]!=-1) return dp[index];
        int cost1 = Integer.MAX_VALUE;
        int cost2 = Integer.MAX_VALUE;
        
        cost1 = func(index-1,arr,dp)+Math.abs(arr[index]-arr[index-1]);
        if(index>=2){
            cost2 = func(index-2,arr,dp)+Math.abs(arr[index]-arr[index-2]);
        }
        return dp[index] = Math.min(cost1,cost2);
    }
}


//{ Driver Code Starts.

// } Driver Code Ends