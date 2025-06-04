// User function Template for Java

class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int cnt = 0;
        int i = 0;
        int j = 0;
        int n1 = a.length;
        int n2 = b.length;
        int el = -1;
        while(i<n1 && j<n2){
            if(a[i]<b[j]){
                if(cnt==k-1) el = a[i];
                cnt++;
                i++;
            }else{
                if(cnt==k-1) el = b[j];
                cnt++;
                j++;
            }
        }
        while(i<n1){
            if(cnt==k-1) el = a[i];
                cnt++;
                i++;
        }
        while (j<n2){
            if(cnt==k-1) el = b[j];
                cnt++;
                j++;
        }
        return el;
    }
}