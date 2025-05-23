/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution {
    int floorSqrt(int n) {
        // Your code here
        int s = 1;
        int e = n/2;
        int ans = 1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(mid*mid==n){
                ans= mid;
                break;
            }
        else if(mid*mid<n){
                ans = mid;
                s = mid+1;
            }
        else if(mid*mid>n){
            e = mid-1;
        }
        }
        return ans;
    }
}