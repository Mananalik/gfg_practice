class Pair{
    int start;
    int end;
    int pos;
    Pair(int start, int end, int pos){
        this.start = start;
        this.end = end;
        this.pos = pos;
    }
}
class comparatorPair implements Comparator<Pair>{
    @Override
    public int compare(Pair a , Pair b ){
        int x = a.end;
        int y = b.end;
        if(x>y){
            return 1;
        }
        else if(x<y){
            return -1;
        }else{
            return 0;
        }
    }
}
class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int start[], int end[]) {
        // add your code here
        int n = start.length;
        Pair arr[] = new Pair[n];
        for(int i=0;i<n;i++){
            arr[i] = new Pair(start[i],end[i],i+1);
        }
        Arrays.sort(arr,new comparatorPair());
        int cnt = 1; 
        int freetime = arr[0].end;
        for(int i=1;i<n;i++){
            if(arr[i].start>freetime){
                cnt++;
                freetime = arr[i].end;
            }
        }
        return cnt;
    }
}
